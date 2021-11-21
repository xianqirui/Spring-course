package org.example;

import org.example.ba03.SomeSercice;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mytest03 {
    @Test
    public void test(){
        String config="applocationContext.xml";
        ApplicationContext ac=new ClassPathXmlApplicationContext(config);
        SomeSercice proxy =(SomeSercice) ac.getBean("someService");
       String str= proxy.around("lishi",20);
        System.out.println(str);


    }
}
