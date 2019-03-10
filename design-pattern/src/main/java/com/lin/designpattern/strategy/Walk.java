package com.lin.designpattern.strategy;

public class Walk implements Transport {
    @Override
    public void type() {
        System.out.println("走路");
    }
}
