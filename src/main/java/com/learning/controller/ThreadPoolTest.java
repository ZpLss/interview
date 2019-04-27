package com.learning.controller;

import com.learning.bean.ThreadB;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * ClassName:ThreadPoolTest
 * Package:com.learning.controller
 * Description:
 * Date:2019/4/27 23:59
 * Author:13651027050
 */
public class ThreadPoolTest {

    public static void main(String[] args) {

        ExecutorService pool = Executors.newCachedThreadPool();
        ThreadB threadB = new ThreadB();

        pool.execute(threadB);

        ExecutorService pool2 = Executors.newFixedThreadPool(2);
        pool2.execute(threadB);




    }

}
