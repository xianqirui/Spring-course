package org.example.ba04;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


@Component("myStudent")

public class Student {

    @Value("张飞")
    private String name;
    @Value("29")
    private int age;
    //byName自动注入
    //@Autowired 还有一个属性 required，默认值为 true，表示当匹配失败后，会终止程序运
    //行。若将其值设置为 false，则匹配失败，将被忽略，未匹配的属性值为 null。
    @Autowired
    @Qualifier(value = "mySchool")
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
