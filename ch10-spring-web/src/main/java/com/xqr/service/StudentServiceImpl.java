package com.xqr.service;

import com.xqr.dao.StudentDao;
import com.xqr.domain.Student;

import java.util.List;

public class StudentServiceImpl implements StudentService {
    //应用类型
    private StudentDao studentDao;
//使用set方法
    public void setStudentDao(StudentDao studentDao) {
        this.studentDao = studentDao;
    }

    @Override
    public int addStudent(Student student) {
        int nums=studentDao.insertStudent(student);
        return nums;
    }

    @Override
    public List<Student> queryStudent() {
        List<Student> students=studentDao.selectStudent();
        return students;
    }
}
