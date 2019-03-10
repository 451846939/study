package com.lin.designpattern.template;

public class PayTemplate {
    /**
     * 传入金额
     * @param money
     * @param payment
     */
    public void pay(int money,Payment payment){
        System.out.println("获取token");
        int balance=100;
        System.out.println("获取到第三方账户余额为"+balance);
        payment.doSomething(balance);
    }
}
