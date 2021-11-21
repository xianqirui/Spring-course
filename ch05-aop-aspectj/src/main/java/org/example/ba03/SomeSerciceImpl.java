package org.example.ba03;
//目标类

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
}
