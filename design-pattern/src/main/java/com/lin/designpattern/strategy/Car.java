package com.lin.designpattern.strategy;

public class Car implements Transport {
    @Override
    public void type() {
        System.out.println("开车");
    }
}
