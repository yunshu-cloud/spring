package com.yunshu.springioc;

import com.yunshu.springioc.pojo.Student;
import com.yunshu.springioc.service.StudentService;

public class Test {
    public static void main(String[] args) {
        StudentService studentService = new StudentService();
        Student student = studentService.findByIdUsingContainer(1);
        System.out.println(student);
    }
}
