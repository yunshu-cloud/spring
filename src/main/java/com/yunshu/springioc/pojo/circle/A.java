package com.yunshu.springioc.pojo.circle;

public class A {
     private B b;

    public B getB() {
        return b;
    }

    public void setB(B b) {
        this.b = b;
    }

    public A() {
    }

    @Override
    public String toString() {
        return "A{" +
                "b=" + b +
                '}';
    }
}
