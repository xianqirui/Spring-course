package com.xqr.Handler;

import com.xqr.util.ServiceTool;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class MyHandler implements InvocationHandler {

    private Object target;

    public MyHandler(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("执行Invok方法");
        Object res = null;
        if("doSome".equals(method.getName())){
            ServiceTool.dolog();
            res = method.invoke(target, args);
            ServiceTool.d0thing();
        }else{
            res = method.invoke(target, args);
        }
        return res;
    }
}
