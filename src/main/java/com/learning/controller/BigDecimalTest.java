package com.learning.controller;

import java.math.BigDecimal;
import java.util.Date;

/**
 * Author:zhangp
 * Date:2019/6/19 14:00
 * Description:
 */
public class BigDecimalTest {
    public static void main(String[] args) {
        BigDecimal b1 = new BigDecimal(10);
        BigDecimal b2 = new BigDecimal(3);
        BigDecimal divide = b1.divide(b2, 1, BigDecimal.ROUND_DOWN);
        BigDecimal divide2 =b1.divide(b2,1,BigDecimal.ROUND_UP);
        System.out.println(divide);
        System.out.println(divide2);


    }



}
