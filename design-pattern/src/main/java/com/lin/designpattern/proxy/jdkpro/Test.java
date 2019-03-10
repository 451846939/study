package com.lin.designpattern.proxy.jdkpro;

import com.lin.designpattern.proxy.Human;
import com.lin.designpattern.proxy.Man;

import java.lang.reflect.Proxy;

public class Test {
    public static void main(String[] args) {
        JdkProMan jdkProMan = new JdkProMan(new Man());
        Human o =(Human) Proxy.newProxyInstance(Man.class.getClassLoader(), Man.class.getInterfaces(), jdkProMan);
        o.work();
        System.out.println(o.getClass());
//        byte[] bytes = ProxyGenerator.generateProxyClass("$Proxy0", new Class[]{JdkProMan.class});
//            File file = new File("E:\\codes\\ideaworkspace\\resources\\design-pattern\\src\\main\\java\\com\\lin\\designpattern\\proxy\\jdkpro\\$Proxy0.class");
//        try (FileOutputStream fileOutputStream = new FileOutputStream(file )) {
//            fileOutputStream.write(bytes);
////            file.delete();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
    }
}
