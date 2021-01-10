package com.learning.basic_data_type;

import java.util.ArrayList;
import java.util.List;

/**
 * 基本数据类型
 */
public class Test1 {
    public static void main(String[] args) {
        //可以定义泛型参数
        List<Integer> list = new ArrayList<>();
        //数据缓存
        Integer num1 = 127;
        Integer num2 = 127;
        System.out.println(num1 == num2);
        Integer num3 = 128;
        Integer num4 = 128;
        System.out.println(num3 == num4);//false
        System.out.println(num3.equals(num4));//true
    }

    public void sentNotice(String msg) {
        System.out.println(msg);

    }

    public String sent(String msg){
        return msg;
    }

    public Integer add (int a, int b){
        return a+b;
    }
    public String append(String a, String b){
        return a+b;
    }
}