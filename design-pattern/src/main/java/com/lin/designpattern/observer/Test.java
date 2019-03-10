package com.lin.designpattern.observer;

import net.sf.cglib.proxy.Enhancer;

import java.lang.reflect.Method;
import java.util.Arrays;

public class Test {
    public static void main(String[] args) throws NoSuchMethodException {
        Subject subject = new Subject();
        Method setState = subject.getClass().getMethod("setState", String.class);
        Observer observer=()->System.out.println("调用了该方法！");
        Observer observer2=()->System.out.println("恭喜你又被调用了");
        EventListeners.addListener(Subject.class,setState,Arrays.asList(observer,observer2));
        CGlibProSubject cGlibProSubject = new CGlibProSubject();
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(Subject.class);
        enhancer.setCallback(cGlibProSubject);
        Subject o = (Subject) enhancer.create();
        o.setState("aaa");
        o.getState();
    }
}
