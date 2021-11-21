package org.example.ba02;
//目标类

public class SomeSerciceImpl implements SomeSercice {
    @Override
    public void doSome(String name,Integer age) {
        System.out.println("doSome目标方法执行");

    }
    @Override
    public String doOther(String name,Integer age){
        System.out.println("目标方法doOther");
        return "abcd";
    }
}
