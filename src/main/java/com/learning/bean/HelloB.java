package com.learning.bean;

/**
 * ClassName:HelloB
 * Package:com.learning.bean
 * Description:
 * Date:2019/4/27 19:52
 * Author:13651027050
 */
public class HelloB extends HelloA{

    public HelloB() {
        System.out.println("HelloB");
    }

    static {
        System.out.println("static B");
    }

    public static void main(String[] args) {
        System.out.println("start-----");
        new HelloB();
        System.out.println("end-------");



    }



}
