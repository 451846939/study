package com.lin.designpattern.factory;

import com.lin.designpattern.factory.abstr.CarFactory;
import com.lin.designpattern.factory.simple.SimpleFactory;

public class Test {
    public static void main(String[] args) throws Exception {
        //如果我们不使用工厂模式那么我们创建对象会使用new
        System.out.println(new Maserati().type());
        //—————————分割线—————————————————————————
        //但是如果创建的过程比较复杂，并且有大量的重复工作
        //这时候如果我们还是去new那就会很麻烦下面我们使用简单工厂模式
        System.out.println(new SimpleFactory().creatCar("玛莎拉蒂").type());
        //这时候就不需要关心创建的过程
        System.out.println(new SimpleFactory().creatCar("东风").type());
        //—————————分割线—————————————————————————
        //以上为简单工厂，为了使用户更好的创建自己想要的对象，那我们可以使用抽象工厂
        //以下为抽象工厂
        System.out.println(new CarFactory().creactDongfengCar().type());
        System.out.println(new CarFactory().creactMaseratiCar().type());
        //我们可以看到这样创建对象的方式非常的方便，而且拓展起来也很方便
        //我们只需要在抽象工厂中加入创建的api即可
    }
}
