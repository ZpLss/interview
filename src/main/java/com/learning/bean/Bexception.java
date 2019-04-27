package com.learning.bean;

/**
 * ClassName:Bexception
 * Package:com.learning.bean
 * Description:
 * Date:2019/4/27 19:34
 * Author:13651027050
 */
public class Bexception extends Aexception {
    private String a;
    public Bexception (String a){
        this.a = a;
    }

    public String getA() {
        return a;
    }

    public void setA(String a) {
        this.a = a;
    }
}
