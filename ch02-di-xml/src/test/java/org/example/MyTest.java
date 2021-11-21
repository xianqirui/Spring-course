package org.example;

import org.example.ba01.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Date;

public class MyTest {
    @Test
    public void test01(){
        String config="ba01/applicationContext.xml";
        ApplicationContext ac=new ClassPathXmlApplicationContext(config);
        //
        Student myStudent =(Student) ac.getBean("myStudent");
        System.out.println("student对象:"+myStudent);
       /* myStudent.setName("adad");
        System.out.println(myStudent);*/
    }
    @Test
    public void test02(){
        String config="ba01/applicationContext.xml";
        ApplicationContext ac=new ClassPathXmlApplicationContext(config);
        //
        Student myStudent =(Student) ac.getBean("myStudent");
        System.out.println("student对象:"+myStudent);
       /* myStudent.setName("adad");
        System.out.println(myStudent);*/
    }
    @Test
    public void test03(){
        String config="ba01/applicationContext.xml";
        ApplicationContext ac=new ClassPathXmlApplicationContext(config);
        //
        Date Date =(Date) ac.getBean("Data");
        System.out.println("时间:"+Date);
       /* myStudent.setName("adad");
        System.out.println(myStudent);*/
    }
}
