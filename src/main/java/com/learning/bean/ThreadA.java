package com.learning.bean;

/**
 * ClassName:ThreadA
 * Package:com.learning.bean
 * Description:
 * Date:2019/4/27 22:33
 * Author:13651027050
 */
public class ThreadA extends Thread {


    @Override
    public void run() {
        for (int i = 1;i <10; i++){
            System.out.println(getName() + ":线程开始---" + i);
        }
    }
}
