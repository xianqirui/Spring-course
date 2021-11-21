package org.example.ba05;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;


@Component("myStudent")

public class Student {

    @Value("张飞")
    private String name;
    @Value("29")
    private int age;


    //Spring提供了对 jdk中@Resource注解的支持。@Resource 注解既可以按名称匹配Bean，
    //也可以按类型匹配 Bean。默认是按名称注入。使用该注解，要求 JDK 必须是 6 及以上版本。
    //@Resource 可在属性上，也可在 set 方法上。
    @Resource
    //@Resource 注解若不带任何参数，采用默认按名称的方式注入，
    // 如果按名称不能注入 bean，则会按照类型进行 Bean 的匹配注入
    //byName 注入引用类型属性
    //@Resour(Name="mySchool")
    private School school;

    public Student() {
        System.out.println("无参构造创建对象");
    }
    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", school=" + school +
                '}';
    }
}
