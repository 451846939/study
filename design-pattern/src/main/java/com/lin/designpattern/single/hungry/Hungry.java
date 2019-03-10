package com.lin.designpattern.single.hungry;

import java.io.Serializable;

/**
 * 线程安全的饿汉模式
 */
public class Hungry implements Serializable {
    public static Hungry hungry=new Hungry();
    private Hungry(){}
    public static final Hungry newInstance(){
        return hungry;
    }

    /**
     * 当实现Serializable接口后，序列化问题，反序列的时候jvm会调用这个方法，所以重新即可
     * @return
     */
    private Object readResolve(){
        return hungry;
    }
}
