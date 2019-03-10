package com.lin.designpattern.template;

public interface Payment {
    /**
     * 传入余额，做某件事
     * @param balance
     */
    void doSomething(int balance);
}
