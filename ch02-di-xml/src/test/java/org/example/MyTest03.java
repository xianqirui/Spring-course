package org.example;

import org.example.ba03.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.File;

public class MyTest03 {
    @Test
    public void test(){
        String config="ba03/applicationContext.xml";
        ApplicationContext ac=new ClassPathXmlApplicationContext(config);
        //
        Student myStudent =(Student)ac.getBean("myStudent1");
        System.out.println("student对象:"+myStudent);

    }
    @Test
    public void test2(){
        String config="ba03/applicationContext.xml";
        ApplicationContext ac=new ClassPathXmlApplicationContext(config);
        //
        Student myStudent =(Student)ac.getBean("myStudent2");
        System.out.println("student对象:"+myStudent);

    }
    @Test
    public void test3(){
        String config="ba03/applicationContext.xml";
        ApplicationContext ac=new ClassPathXmlApplicationContext(config);
        //
        Student myStudent =(Student)ac.getBean("myStudent3");
        System.out.println("student对象:"+myStudent);

    }
    @Test
    public void test4(){
        String config="ba03/applicationContext.xml";
        ApplicationContext ac=new ClassPathXmlApplicationContext(config);
        //
        File myfile =(File)ac.getBean("myfile");
        System.out.println("信息:"+myfile.getName());


    }
}
