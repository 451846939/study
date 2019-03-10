package com.lin.designpattern.template;

public class Test {
    public static void main(String[] args) {
        PayTemplate payTemplate = new PayTemplate();
        payTemplate.pay(200,(balance)->{
            if (200<=balance){
                System.out.println("支付成功");
            }else {
                System.out.println("余额不足");
            }
        });
    }
}
