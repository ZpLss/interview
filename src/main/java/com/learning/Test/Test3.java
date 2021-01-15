package com.learning.Test;

import java.util.Scanner;

/**
 * Author:zhangp
 * Date:2021/1/12 20:07
 * Description:
 */
public class Test3 {

    public static void main(String[] args) {

        for (Integer i = 0;i<1000;i++){
            new Thread(new Runnable() {
                @Override
                public void run() {
                    Test3.inc();
                }
            }).start();
        }
        System.out.println(Test3.count);





//        int x = (12+3*8)/4%3;
//        System.out.println(x);
//        int i = 1;
//        while (i==4){
//
//        }






//        int i = 10;
//        int j = 0;
//        try {
//            j+=i/j;
//            System.out.println(j);
//        }catch (ArithmeticException ex){
//            System.out.println("1");
//        }catch (Exception e){
//            System.out.println("2");
//        }finally {
//            System.out.println(":"+j);
//        }
//        int i = 1;
//        int j = 2;
//        try {
//            j+=i+j;
//            System.out.print(j);
//        }catch (Exception e){
//            System.out.print(":");
//        }finally {
//            System.out.println(j);
//        }
//        int x = 3;
////switch (x){
////    case 2:
////    case 3:
////    case 4:
////    ++x;
////    default:
////        x++;
////}
////        System.out.println(x);
    }

    private  static  Integer count = 0;
    static  void inc(){
        count++;
    }






}
