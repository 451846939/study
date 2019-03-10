package com.lin.designpattern.observer;

import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 事件注册器
 */
public class EventListeners {
    private static Map<Class<?>, Map<Method, List<Observer>>> events = new HashMap<>();

    public static void addListener(Class<?> subject, Method method, List<Observer> observer) {
        Map<Method, List<Observer>> methodMapMap = events.get(subject);
        if (methodMapMap != null) {
            checkObjectHaveMethodAndPutObserver(subject, method, observer, methodMapMap);
        }else {
            Map<Method,List<Observer>> methedsObservers=new HashMap<>();
            checkObjectHaveMethodAndPutObserver(subject, method, observer, methedsObservers);
            events.put(subject,methedsObservers);
        }
    }

    private static void checkObjectHaveMethodAndPutObserver(Class<?> subject, Method method, List<Observer> observer, Map<Method, List<Observer>> methodMapMap) {
        Arrays.stream(subject.getDeclaredMethods()).forEach(e->{
            if (e.getName().equals(method.getName())){
                methodMapMap.put(method,observer);
            }
        });
    }

    public static void notice(Class<?> object,Method method) {
        Map<Method, List<Observer>> methodListMap = events.get(object);
        if (methodListMap!=null){
            methodListMap.get(method).forEach(e->e.callback());
        }
    }
    public static boolean haveMethodObServer(Class<?> object,Method method){
        Map<Method, List<Observer>> methodListMap = events.get(object);
        if (methodListMap!=null){
            List<Observer> observers = methodListMap.get(method);
            if (observers!=null&&!observers.isEmpty()){
                return true;
            }
        }
        return false;
    }
}
