package com.lin.designpattern.factory.func;

import com.lin.designpattern.factory.Car;
import com.lin.designpattern.factory.Maserati;

public class MaseratiFactory implements Factory {
    @Override
    public Car createCar() {
        return new Maserati();
    }
}
