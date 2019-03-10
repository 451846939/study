package com.lin.designpattern.factory.func;

import com.lin.designpattern.factory.Car;
import com.lin.designpattern.factory.Dongfeng;

public class DongfengFactory implements Factory {
    public Car createCar() {
        return new Dongfeng();
    }
}
