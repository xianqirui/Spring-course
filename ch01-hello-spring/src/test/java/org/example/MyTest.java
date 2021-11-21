package org.example;

import org.example.servlet.SomeServelt;
import org.example.servlet.SomeServeltlmpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.applet.AppletContext;
import java.util.Date;

public class MyTest {
    @Test
    public void testMy01() {
        SomeServelt service = new SomeServeltlmpl();
        service.doSome();
    }

    @Test
    public void testMy02() {
        //指定名称
        String comfig = "beneas.xml";
        //创建容器对象, ApplicationContext
        ApplicationContext ac = new ClassPathXmlApplicationContext(comfig);
        //从容器中获取对象
        SomeServelt servelt = (SomeServelt) ac.getBean("someService");
        servelt.doSome();
    }

    //获取容器中对象信息
    @Test
    public void testMy03() {
        String comfig = "beneas.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(comfig);
        int num = ac.getBeanDefinitionCount();
        System.out.println("容器中对象的数量:" + num);
        //容器中对象名称
        String[] name = ac.getBeanDefinitionNames();
        for (String names : name) {
            System.out.println("对象名：" + names);
        }
    }

    //获取一个非自定义类对象
    @Test
    public void testMy04() {
        String comfig = "beneas.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(comfig);
        Date my = (Date) ac.getBean("mydads");
        System.out.println("时间:"+my);
    }

}

