package com.lin.designpattern.factory.abstr;

import com.lin.designpattern.factory.Car;

/**
 * 抽象工厂
 */
public abstract class AbstractFactory {
    //这里还可以写很多初始化的一些东西
    abstract Car creactDongfengCar();
    abstract Car creactMaseratiCar();
}
