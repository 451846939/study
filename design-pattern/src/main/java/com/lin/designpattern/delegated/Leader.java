package com.lin.designpattern.delegated;

import java.util.HashMap;
import java.util.Map;

public class Leader {
    private static Map<String,Employee> employees=new HashMap<>();
    static {
        employees.put("开车",new Driver());
        employees.put("做饭",new Cook());
    }
    public void doSomething(String something){
        Employee employee = employees.get(something);
        if (employee!=null){
            employee.skill();
        }else {
            System.out.println("抱歉，我们没有员工可以完成这样一件事");
        }
    }
}
