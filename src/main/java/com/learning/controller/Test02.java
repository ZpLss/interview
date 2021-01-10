package com.learning.controller;

import com.learning.bean.Aexception;
import com.learning.bean.Bexception;

/**
 * ClassName:Test02
 * Package:com.learning.controller
 * Description:
 * Date:2019/4/27 16:12
 * Author:13651027050
 */
public class Test02 {

    public Test02() {

        try {
            if (true){

                throw new ArithmeticException();
            }
        }catch (ArithmeticException e){
            System.out.println("begin");
            return;
        }finally {
            System.out.println("finally");
        }
        System.out.println("end");
    }

    public static void main(String[] args) {

        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                while (true){
                    for (int i = 1;i <= 59;i++){
                        System.out.println(i + ",");
                        if (i == 59){
                            try {
                                Thread.sleep(1000);
                                i = 1;
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                        }
                    }
                }
            }
        });

        thread.start();

        ThreadLocal threadLocal = new ThreadLocal();


    }

}
