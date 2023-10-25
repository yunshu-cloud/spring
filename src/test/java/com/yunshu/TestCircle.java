package com.yunshu;

import com.yunshu.springioc.pojo.circle.A;
import com.yunshu.springioc.pojo.circle.B;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestCircle {
    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
        A bean = ac.getBean(A.class);
        System.out.println(bean.getB());
        B bean1 = ac.getBean(B.class);
        System.out.println(bean1.getA());
    }

}
