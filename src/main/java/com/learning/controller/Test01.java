package com.learning.controller;

import com.learning.bean.Worker;
import sun.security.util.Length;

import java.util.*;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * ClassName:Test01
 * Package:com.learning
 * Description:
 * Date:2019/4/15 20:55
 * Author:1365102705
 */
public class Test01 {
    public static void main(String[] args) throws Exception {
        List<Integer> a = Stream.of(2, 1, 3).collect(Collectors.toList());
        List<Integer> b = Stream.of(2, 3, 4).collect(Collectors.toList());
        List<Integer> union = union(a, b);
        for (Integer integer : union){
            System.out.println(integer);
        }


//        System.out.println(new Integer[129] == new Integer[129]);
//        System.out.println(Integer.valueOf(127) == Integer.valueOf(127));
//
//
//
//        Worker worker1 = new Worker("hah","15");
//        Worker worker2 = worker1;
//        System.out.println(worker1);
//        worker2.setName("heihei");
//
//        System.out.println(worker1);
//
//        System.out.println(worker2);
//
//
//        int i = 10;
//        int j = i;
//        j+=1;
//        System.out.println(i);
//        System.out.println(j);
//
//        System.out.println(reSum(1));
//        System.out.println(reSum(6));
//
//        Lock lock = new ReentrantLock();
//        Condition condition = lock.newCondition();

    }

    public static Integer reSum(int n){
        //递归算法，自己调自己
        if (n == 1 || n==0){
            return n;
        }

        return reSum(n-1) + reSum(n-2);
    }

    public static List<Integer>  union(List<Integer> a, List<Integer> b){

        int m = a.size();
        int n = b.size();
        List<Integer> c = new ArrayList<>(m + n);
        Set<Integer> setList = new HashSet<>();
        for (Integer in : a){
            b.add(in);
        }
        for (Integer in2 : b){
            setList.add(in2);
        }
        Iterator<Integer> iterator = setList.iterator();
        while (iterator.hasNext()){
            c.add(iterator.next());
        }
        //时间复杂度  O(n)
        return c;
    }
}
