package com.yunshu.springcontainer;

import com.yunshu.springcontainer.pojo.Student;
import com.yunshu.springcontainer.service.StudentService;

public class Test {
    public static void main(String[] args) {
        StudentService studentService = new StudentService();
        Student student1 = studentService.findByIdUsingContainer(1);
        Student student2 = studentService.findByIdUsingContainer(1);
        System.out.println(student1.hashCode());
        System.out.println(student2.hashCode());
    }
}
