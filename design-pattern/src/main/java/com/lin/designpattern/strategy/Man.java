package com.lin.designpattern.strategy;

public class Man {

    void trip(Transport transport){
        System.out.println("我要去旅行,选择");
        transport.type();
        System.out.println("去成都");
    }
}
