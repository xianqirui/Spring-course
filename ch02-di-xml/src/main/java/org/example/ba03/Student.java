package org.example.ba03;

public class Student {
    private String name;
    private int age;
    private School school;

    public Student() {
        System.out.println("无参构造");
    }

    public Student(String myname, int myage, School myschool) {
        System.out.println("有参构造");
        this.name = myname;
        this.age = myage;
        this.school = myschool;
    }

    public void setName(String name) {
        System.out.println("setName:"+name);
        this.name = name;
    }

    public void setAge(int age) {
        System.out.println("setAge:"+age);
        this.age = age;
    }

    public void setSchool(School school) {
        System.out.println("setScholl:"+school);
        this.school = school;
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
