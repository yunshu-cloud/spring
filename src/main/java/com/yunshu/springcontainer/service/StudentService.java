package com.yunshu.springcontainer.service;

import com.yunshu.springcontainer.Container;
import com.yunshu.springcontainer.dao.StudentDao;
import com.yunshu.springcontainer.dao.impl.StudentImpl;
import com.yunshu.springcontainer.pojo.Student;

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
