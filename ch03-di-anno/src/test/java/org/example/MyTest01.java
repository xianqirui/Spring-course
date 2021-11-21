package org.example;

import org.example.ba01.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest01 {
    @Test
    public void test01(){
        String config="applicatContext.xml";
        ApplicationContext ac=new ClassPathXmlApplicationContext(config);
        Student myStudent = (Student) ac.getBean("student");
        System.out.println("学生："+myStudent);
    }
}
