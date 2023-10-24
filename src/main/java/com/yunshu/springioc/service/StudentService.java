package com.yunshu.springioc.service;

import com.yunshu.springioc.dao.StudentDao;
import com.yunshu.springioc.dao.impl.StudentImpl;
import com.yunshu.springioc.pojo.Student;

public class StudentService {


    public Student findById(int id){
        StudentDao studentDao = new StudentImpl();
        return studentDao.findById(id);
    }
}
