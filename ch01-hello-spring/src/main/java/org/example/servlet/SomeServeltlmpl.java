package org.example.servlet;

public class SomeServeltlmpl implements SomeServelt{
    public SomeServeltlmpl() {
        System.out.println("构造方法执行");
    }

    @Override
    public void doSome() {
        System.out.println("执行了doSome方法");
    }
}
