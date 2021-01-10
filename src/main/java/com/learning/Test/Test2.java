package com.learning.Test;

/**
 * Author:zhangp
 * Date:2021/1/1 0:10
 * Description:数据结构和算法
 */
public class Test2 {
    //1  2  3  4  5
    //s, 1, 2, 3, 5, 8, 13...

    public static int fib1(int n){
        if (n < 2){
            return n;
        }
        return fib1(n-1) + fib1(n-2);
    }

    public static int fib2(int n){
        if (n <= 2){
            return n;
        }
        int first = 0;
        int second = 1;
        for (int i = 1;i <= n-1; i++){
            int sum = first + second;
            first = second;
            second = sum;
        }
        return second;
    }

    public static void main(String[] args) {

        int n = 20;
        System.out.println(fib1(n));
        System.out.println(fib2(n));





    }

}
