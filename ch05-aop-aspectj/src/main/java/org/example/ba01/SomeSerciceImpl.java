package org.example.ba01;
//目标类

public class SomeSerciceImpl implements SomeSercice {
    @Override
    public void doSome(String name,Integer age) {
        System.out.println("doSome目标方法执行");

    }
}
