package com.lin.designpattern.proxy.staticpro;

import com.lin.designpattern.proxy.Man;

public class Test {
    public static void main(String[] args) {
        //不使用代理
        Man man = new Man();
        man.work();
        System.out.println("-------------------------------");
        //使用代理
        StaticProxMan staticProxMan = new StaticProxMan(new Man());
        staticProxMan.work();
        //由此可见代理其实可以增强我们的方法
    }
}
