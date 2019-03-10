package com.lin.designpattern.factory.simple;

import com.lin.designpattern.factory.Car;
import com.lin.designpattern.factory.Dongfeng;
import com.lin.designpattern.factory.Maserati;

/**
 *简单的工厂
 */
public class SimpleFactory {

    public Car creatCar(String type) throws Exception {
        //type这里其实可以使用枚举
        if (type==null||"".equals(type)){
            throw new Exception("没有该类型");
        }
        if ("玛莎拉蒂".equals(type)){
            return new Maserati();
        }else if ("东风".equals(type)){
            return new Dongfeng();
        }else {
            throw new Exception("没有该类型");
        }
    }
}
