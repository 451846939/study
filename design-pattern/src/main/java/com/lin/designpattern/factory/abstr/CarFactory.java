package com.lin.designpattern.factory.abstr;

import com.lin.designpattern.factory.Car;
import com.lin.designpattern.factory.func.DongfengFactory;
import com.lin.designpattern.factory.func.MaseratiFactory;

public class CarFactory extends AbstractFactory {
    @Override
    public Car creactDongfengCar() {
        return new DongfengFactory().createCar();
    }

    @Override
    public Car creactMaseratiCar() {
        return new MaseratiFactory().createCar();
    }
}
