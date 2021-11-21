package org.example;

import org.example.ba01.SomeSercice;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mytest {
    @Test
    public void test(){
        String config="applocationContext.xml";
        ApplicationContext ac=new ClassPathXmlApplicationContext(config);
        SomeSercice proxy =(SomeSercice) ac.getBean("someService");
        proxy.doSome("lishi",20);
        System.out.println("proxy:"+proxy.getClass().getName());

    }
}
