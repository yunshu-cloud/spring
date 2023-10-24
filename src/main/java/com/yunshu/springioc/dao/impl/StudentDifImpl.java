package com.yunshu.springioc.dao.impl;

import com.yunshu.springcontainer.pojo.Student;
import com.yunshu.springioc.dao.StudentDao;


public class StudentDifImpl implements StudentDao {
    @Override
    public Student findById(int id) {
        System.out.println("another data access");
        return new Student(2,"空中乘务员","上海");
    }
}
