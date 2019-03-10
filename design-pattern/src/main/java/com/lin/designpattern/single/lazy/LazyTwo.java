package com.lin.designpattern.single.lazy;

/**
 * 懒汉模式(线程安全)
 */
public class LazyTwo {
    public static LazyTwo lazy=null;
    private LazyTwo(){}

    public synchronized static LazyTwo newInstance() {
        if (lazy==null){
            lazy=new LazyTwo();
        }
        return lazy;
    }
}
