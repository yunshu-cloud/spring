package com.yunshu.springioc.dao.impl;

import com.yunshu.springcontainer.pojo.Student;
import com.yunshu.springioc.dao.StudentDao;

public class StudentImpl implements StudentDao {
    // 接口实现方法
    @Override
    public Student findById(int id) {
        return new Student(1,"程序员","北京");
    }
}
