package org.example.ba04;
//目标类

import org.springframework.stereotype.Component;


public class SomeSerciceImpl implements SomeSercice {
    @Override
    public void doSome(String name,Integer age) {
        System.out.println("doSome目标方法执行");

    }

    @Override
    public String around(String name, Integer age) {
        System.out.println("这是环绕通知");
        return "null";
    }

    @Override
    public void Throwing() {
        System.out.println("异常通知"+(10/0));
    }
}
