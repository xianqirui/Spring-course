package org.example.ba04;

public class Student {
    private String name;
    private int age;
    private School school;
    public Student() {
    }

    public Student(String myname, int myage, School myschool) {


        this.name = myname;
        this.age = myage;
        this.school = myschool;
    }
    public void setName(String name) {


        this.name = name;
    }

    public void setAge(int age) {


        this.age = age;
    }

    public void setSchool(School school) {


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
