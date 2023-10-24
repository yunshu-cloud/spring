package com.yunshu.springioc.service;

import com.yunshu.springioc.Container;
import com.yunshu.springioc.dao.StudentDao;
import com.yunshu.springioc.dao.impl.StudentImpl;
import com.yunshu.springioc.pojo.Student;

public class StudentService {


    /**
     * 未使用ioc容器
     * @param id
     * @return
     */
    public Student findById(int id){
        StudentDao studentDao = new StudentImpl();
        return studentDao.findById(id);
    }


    /**
     * 使用ioc容器
     * @param id
     * @return
     */
    public Student findByIdUsingContainer(int id){
        StudentDao studentDao = (StudentDao) Container.getBean("studentDao");
        return studentDao.findById(id);
    }
}
