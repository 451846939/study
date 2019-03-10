package com.lin.designpattern.proxy.jdkpro;

import com.lin.designpattern.proxy.Human;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class JdkProMan implements InvocationHandler {
    Human human=null;
    public JdkProMan(Human human){
        this.human=human;
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("先吃饭");
        method.invoke(human);
        System.out.println("打卡");
        return proxy;
    }
}
