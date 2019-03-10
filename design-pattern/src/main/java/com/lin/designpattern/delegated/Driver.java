package com.lin.designpattern.delegated;

public class Driver implements Employee {
    @Override
    public void skill() {
        System.out.println("我是司机，我负责开车");
    }
}
