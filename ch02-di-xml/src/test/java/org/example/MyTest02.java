package org.example;

import org.example.ba02.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest02 {
    @Test
    public void test(){
        String config="ba02/applicationContext.xml";
        ApplicationContext ac=new ClassPathXmlApplicationContext(config);
        //
        Student myStudent =(Student) ac.getBean("myStudent2");
        System.out.println("student对象:"+myStudent);

    }
}
