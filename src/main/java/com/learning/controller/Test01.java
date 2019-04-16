package com.learning.controller;

import com.learning.bean.ThreadCall;
import com.learning.bean.Worker;

/**
 * ClassName:Test01
 * Package:com.learning
 * Description:
 * Date:2019/4/15 20:55
 * Author:1365102705
 */
public class Test01 {
    public static void main(String[] args) throws Exception {
        Worker worker1 = new Worker("hah","15");
        Worker worker2 = worker1;
        System.out.println(worker1);
        worker2.setName("heihei");
        System.out.println(worker1);
        System.out.println(worker2);

        int i = 10;
        int j = i;
        j+=1;
        System.out.println(i);
        System.out.println(j);

    }
}
