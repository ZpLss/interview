package com.learning.controller;

import com.learning.bean.CallAableThread;
import com.learning.bean.ThreadA;
import com.learning.bean.ThreadB;

import java.util.concurrent.*;

/**
 * ClassName:ThreadTest
 * Package:com.learning.controller
 * Description:
 * Date:2019/4/27 22:33
 * Author:13651027050
 */
public class ThreadTest {

    public static void main(String[] args) throws InterruptedException, ExecutionException {

        CountDownLatch count = new CountDownLatch(100);

        ThreadA threadA = new ThreadA();
        threadA.start();
//        ThreadA threadA1 = new ThreadA();
//        threadA1.start();

        ThreadB threadB = new ThreadB();
        new Thread(threadB,"xin").start();
//        count.await();

        CallAableThread callAableThread = new CallAableThread();
        FutureTask futureTask = new FutureTask(callAableThread);

        new Thread(futureTask,"callable").start();
        System.out.println(futureTask.get()+"---------------");



    }
}
