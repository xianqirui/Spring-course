package org.example.ba01;

import org.springframework.stereotype.Component;
//正统
//@Component(value = "myStudent")
//也可以
//@Component("myStudent")
//不指定名称，为类名首字母小写
@Component
public class Student {
    private String name;
    private int age;

    public Student() {
        System.out.println("无参构造创建对象");
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
