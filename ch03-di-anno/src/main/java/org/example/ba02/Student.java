package org.example.ba02;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//正统
//@Component(value = "myStudent")
//也可以
@Component("myStudent")
//不指定名称，为类名首字母小写
//@Component
public class Student {
    /*简单类型赋值
    * 1.在属性上赋值无需set方法
    * 2.在set方法上*/
    //@Value(value = "29")
    //value可省略
    @Value("张飞")
    private String name;
    @Value("29")
    private int age;

    public Student() {
        System.out.println("无参构造创建对象");
    }

    // @Value("张飞")
   /* public void setName(String name) {
        this.name = name;
    }
    @Value("29")
    public void setAge(int age) {
        this.age = age;
    }
*/
    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
