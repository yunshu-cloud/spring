package com.yunshu.springioc.dao;

import com.yunshu.springcontainer.pojo.Student;

public interface StudentDao {
    // 根据id查询学生
    Student findById(int id);
}
