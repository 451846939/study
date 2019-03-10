package com.lin.designpattern.proxy.staticpro;

import com.lin.designpattern.proxy.Human;

public class StaticProxMan implements Human {
    Human human =null;

    public StaticProxMan(Human human){
        this.human=human;
    }

    @Override
    public void work() {
        System.out.println("先洗个澡");
        human.work();
    }
}
