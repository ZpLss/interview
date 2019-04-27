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

        Test02 t2 = new Test02();
        System.out.println("in main()!");
//        try {
//            throw new Bexception("b");
//        }catch (Aexception aexception){
//            System.out.println(aexception);
//        }catch (Exception e){
//            System.out.println(e);
//        }




    }

}
