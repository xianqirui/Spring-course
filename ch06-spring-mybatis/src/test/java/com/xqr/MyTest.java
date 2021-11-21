package com.xqr;

import com.xqr.dao.StudentDao;
import com.xqr.domain.Student;
import com.xqr.service.StudentService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class MyTest {
    @Test
    public void tset01(){
        String config="applocationContext.xml";
        ApplicationContext ac=new ClassPathXmlApplicationContext(config);
        String[] Names = ac.getBeanDefinitionNames();
        for (String na:Names){
            System.out.println("容器中对象的名字"+na+"||"+ac.getBean(na));
        }
    }
    @Test
    public void tset02(){
        String config="applocationContext.xml";
        ApplicationContext ac=new ClassPathXmlApplicationContext(config);
      //获取spring容器中的对象
        StudentDao dao = (StudentDao) ac.getBean("studentDao");
        Student student=new Student();
        student.setId(2003);
        student.setName("李白");
        student.setEmail("445464@qq.com");
        student.setAge(55);
        int num=dao.insertStudent(student);
        System.out.println("num="+num);
    }
    @Test
    public void tset03(){
        String config="applocationContext.xml";
        ApplicationContext ac=new ClassPathXmlApplicationContext(config);
        //获取spring容器中dao的对象
        StudentService service = (StudentService) ac.getBean("StudentService");
        Student student=new Student();
        student.setId(2002);
        student.setName("刘伯温");
        student.setEmail("8888@qq.com");
        student.setAge(76);
        int num=service.addStudent(student);
        //spring和mybatis整合时自动提交事务
        System.out.println("num="+num);
    }
    @Test
    public void tset04(){
        String config="applocationContext.xml";
        ApplicationContext ac=new ClassPathXmlApplicationContext(config);
        //获取spring容器中dao的对象
        StudentService service = (StudentService) ac.getBean("studentService");
        List<Student> student= service.queryStudent();
        for(Student stu:student) {
            System.out.println("学生："+stu);
        }
    }
}
