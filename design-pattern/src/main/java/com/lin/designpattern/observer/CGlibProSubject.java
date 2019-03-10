package com.lin.designpattern.observer;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class CGlibProSubject implements MethodInterceptor {

    @Override
    public Object intercept(Object obj, Method method, Object[] args, MethodProxy proxy) throws Throwable {
        String typeName = obj.getClass().getTypeName();
        String myClass = typeName.substring(0, typeName.indexOf("$"));
        Class<?> aClass = obj.getClass().getClassLoader().loadClass(myClass);
        if (EventListeners.haveMethodObServer(aClass, method)) {
            EventListeners.notice(aClass, method);
        }
        Object o = proxy.invokeSuper(obj, args);
        return o;
    }
}
