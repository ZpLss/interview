package com.learning.Test;

/**
 * Author:zhangp
 * Date:2021/1/14 20:05
 * Description:
 */
public class MyStack {

    private int[] arr;
    private int total;

    public MyStack(){
        this.arr = new int[10];
        this.total = -1;
    }

    public void push (int num){
        arr[++total] = num;
    }

    public int pop(){
        return arr[total--];
    }



}
