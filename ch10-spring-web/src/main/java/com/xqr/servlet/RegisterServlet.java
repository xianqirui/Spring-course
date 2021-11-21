package com.xqr.servlet;

import com.xqr.domain.Student;
import com.xqr.service.StudentService;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class RegisterServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String strId=request.getParameter("id");
        String strName=request.getParameter("name");
        String strEmail=request.getParameter("email");
        String strAge=request.getParameter("age");
        System.out.println(strId);

        /*String config= "spring.xml";
        ApplicationContext ac=new ClassPathXmlApplicationContext(config);
System.out.println("容器信息"+ac);
        StudentService service = (StudentService) ac.getBean("studentService");*/

        //可
        //以直接通过 ServletContext 的 getAttribute()方法，按照指定的 key 将容器对象获取到。
       /* String attr= WebApplicationContext.ROOT_WEB_APPLICATION_CONTEXT_ATTRIBUTE;
        WebApplicationContext ac=(WebApplicationContext) this.getServletContext().getAttribute(attr);*/
//通过 WebApplicationContextUtils 获取
        WebApplicationContext ac= WebApplicationContextUtils.getRequiredWebApplicationContext(getServletContext());

        StudentService service = (StudentService) ac.getBean("studentService");
        Student student=new Student();
        student.setId(Integer.parseInt(strId));
        student.setName(strName);
        student.setEmail(strEmail);
        student.setAge(Integer.valueOf(strAge));
        service.addStudent(student);

        request.getRequestDispatcher("/result.jsp").forward(request,response);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
