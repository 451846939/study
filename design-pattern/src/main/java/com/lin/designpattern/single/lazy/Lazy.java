package com.lin.designpattern.single.lazy;

/**
 * 懒汉模式(线程不安全)
 */
public class Lazy {
    public static Lazy lazy=null;
    private Lazy(){}

    public static Lazy newInstance() {
        if (lazy==null){
            lazy=new Lazy();
        }
        return lazy;
    }
}
