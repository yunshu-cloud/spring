package com.yunshu.springcontainer.dao.impl;

import com.yunshu.springcontainer.dao.StudentDao;
import com.yunshu.springcontainer.pojo.Student;


public class StudentDifImpl implements StudentDao {
    @Override
    public Student findById(int id) {
        System.out.println("another data access");
        return new Student(2,"空中乘务员","上海");
    }
}
