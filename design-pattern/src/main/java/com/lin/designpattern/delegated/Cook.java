package com.lin.designpattern.delegated;

public class Cook implements Employee {
    @Override
    public void skill() {
        System.out.println("我是厨师，我负责做饭");
    }
}
