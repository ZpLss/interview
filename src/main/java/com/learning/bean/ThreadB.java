package com.learning.bean;

/**
 * ClassName:ThreadB
 * Package:com.learning.bean
 * Description:
 * Date:2019/4/27 22:40
 * Author:13651027050
 */
public class ThreadB implements Runnable{
    @Override
    public void run() {
//        for (int i = 1;i < 10;i++){
//            System.out.println(Thread.currentThread().getName() + ":开始了" + i);
//        }

        System.out.println(Thread.currentThread().getName() + "开始了");

    }
}
