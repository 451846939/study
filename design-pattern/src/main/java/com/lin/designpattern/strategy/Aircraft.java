package com.lin.designpattern.strategy;

public class Aircraft implements Transport {

    @Override
    public void type() {
        System.out.println("坐飞机");
    }
}
