package com.lin.designpattern.proxy.cglib;

import com.lin.designpattern.proxy.Human;
import com.lin.designpattern.proxy.Man;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class CgligProMan extends Man implements MethodInterceptor {
    Human human=null;
    public CgligProMan(Human human){
        this.human=human;
    }
    @Override
    public Object intercept(Object obj, Method method, Object[] args, MethodProxy proxy) throws Throwable {
        System.out.println("我要先去开车");
        method.invoke(human);
        System.out.println("下班啦");
        System.out.println("再来一次！");
        proxy.invokeSuper(obj,args);
        return obj;
    }
}
