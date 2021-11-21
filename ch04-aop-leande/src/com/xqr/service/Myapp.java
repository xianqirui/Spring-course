package com.xqr.service;

import com.xqr.Handler.MyHandler;
import com.xqr.service.impl.SomeServiceImpl;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class Myapp {
    public static void main(String[] args) {
       /* SomeService service = new SomeServiceImpl();
        service.doSome();
        System.out.println("================");
        service.doOther();*/
        SomeService target=new SomeServiceImpl();
        InvocationHandler handler=new MyHandler(target);
        SomeService proxy = (SomeService) Proxy.newProxyInstance(target.getClass().getClassLoader(),
                target.getClass().getInterfaces(),
                handler);
        proxy.doSome();
        System.out.println("================");
        proxy.doOther();
    }
}
