package com.learning.bean;

/**
 * @author : zp
 *         Date: 2019/4/16 9:54
 *         Description:
 */
public class Worker {
    private String name;
    private String age;

    public Worker(){}
    public Worker(String name, String age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                '}';
    }
}
