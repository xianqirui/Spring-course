package org.example.ba03;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


@Component("myStudent")

public class Student {

    @Value("张飞")
    private String name;
    @Value("29")
    private int age;
    //byType自动注入
    @Autowired
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
