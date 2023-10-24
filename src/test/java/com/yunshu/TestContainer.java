package com.yunshu;

import com.yunshu.springioc.dao.StudentDao;
import com.yunshu.springioc.pojo.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestContainer {

    @Test
    public void testApplicationContext(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
        StudentDao studentDao = ac.getBean("studentDao", StudentDao.class);
        System.out.println(studentDao);
    }
}
