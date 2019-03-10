package com.lin.designpattern.proxy.cglib;

import com.lin.designpattern.proxy.Human;
import com.lin.designpattern.proxy.Man;
import net.sf.cglib.proxy.Enhancer;

public class Test {
    public static void main(String[] args) {
        CgligProMan cgligProMan = new CgligProMan(new Man());
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(Man.class);
        enhancer.setCallback(cgligProMan);
        Human o = (Human) enhancer.create();
        o.work();
        System.out.println(o.getClass());
    }
}
