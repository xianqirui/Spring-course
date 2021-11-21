package org.example;

import org.example.ba02.SomeSercice;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mytest02 {
    @Test
    public void test(){
        String config="applocationContext.xml";
        ApplicationContext ac=new ClassPathXmlApplicationContext(config);
        SomeSercice proxy =(SomeSercice) ac.getBean("someService");
        String str=proxy.doOther("lishi",20);
        System.out.println("str="+str);
        System.out.println("proxy:"+proxy.getClass().getName());

    }
}
