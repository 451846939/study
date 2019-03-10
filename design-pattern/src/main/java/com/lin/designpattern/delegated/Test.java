package com.lin.designpattern.delegated;

public class Test {
    public static void main(String[] args) {
        Leader leader = new Leader();
        leader.doSomething("做饭");
        System.out.println("-----------------------------");
        leader.doSomething("开车");
    }
}
