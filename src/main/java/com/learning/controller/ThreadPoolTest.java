package com.learning.controller;

import com.learning.bean.ThreadB;

import java.util.concurrent.*;

/**
 * ClassName:ThreadPoolTest
 * Package:com.learning.controller
 * Description:
 * Date:2019/4/27 23:59
 * Author:13651027050
 */
public class ThreadPoolTest {

    public static void main(String[] args) {

//        ExecutorService pool = Executors.newCachedThreadPool();
//        ThreadB threadB = new ThreadB();

//        pool.execute(threadB);

//        ExecutorService pool2 = Executors.newFixedThreadPool(2);
//        pool2.execute(threadB);

        ExecutorService executorService = Executors.newCachedThreadPool();

        Future<String> submit = executorService.submit(new Callable<String>() {
            @Override
            public String call() throws Exception {
                System.out.println("kkkkkkk");
                return "Hello Callable";
            }
        });
        try {
            System.out.println(submit.isCancelled());
            System.out.println(submit.isDone());
            System.out.println(submit.get());

        }catch (Exception e){
            e.printStackTrace();
        }


        Callable<Boolean> callable = new Callable<Boolean>() {
            @Override
            public Boolean call() throws Exception {
                System.out.println("Hello");
                return true;
            }
        };

        FutureTask<Boolean> task = new FutureTask<>(callable);
        new Thread(task).start();

        try {
            System.out.println(task.get());
        }catch (Exception e){
            e.printStackTrace();
        }

    }

}
