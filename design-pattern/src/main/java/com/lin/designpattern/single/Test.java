package com.lin.designpattern.single;

import com.lin.designpattern.single.lazy.LazyTwo;

import java.util.Hashtable;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Test {
    public static final Map<String,Object> map=new Hashtable<>();
    public static void main(String[] args) {
        int count=100;
        CountDownLatch countDownLatch=new CountDownLatch(count);
        long startTime = System.currentTimeMillis();
        ExecutorService executorService = Executors.newFixedThreadPool(count);
        for (int i=0;i<=count;i++){
            executorService.submit(() -> {
                try {
                    countDownLatch.await();
                    LazyTwo hungry = LazyTwo.newInstance();
//                    if (map.containsValue(hungry)) {
//                    } else {
//                        map.put("h", hungry);
                        System.out.println(hungry);
//                        System.out.println(map);
//                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            });
//            new Thread(() -> {
//                try {
//                    countDownLatch.await();
//                    Hungry hungry = Hungry.newInstance();
//                    if (map.containsValue(hungry)){
//                    }else {
//                        map.put("h", hungry);
//                        System.out.println(hungry);
////                        System.out.println(map);
//                    }
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//            }).start();
            countDownLatch.countDown();
        }
        executorService.shutdown();
        for (;;){
            if (executorService.isShutdown()){
                long endTime = System.currentTimeMillis();
                long l = endTime - startTime;
                System.out.println("耗时"+l);
                break;
            }
        }
    }
}
