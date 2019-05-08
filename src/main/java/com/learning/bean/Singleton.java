package com.learning.bean;

/**
 * 饿汉式单例模式
 */
//public class Singleton {
//
//    private Singleton(){}
//
//    private static final Singleton singleton = new Singleton();
//
//    public static Singleton getSingleton (){
//
//        return singleton;
//    }
//
//
//}

/**
 * 双重检查  推荐使用，线程安全
 *
 */
public class Singleton {
    //第一步，构造方法私有话
    private Singleton(){}

    //volatile 修饰，保证线程安全
    private static volatile Singleton singleton;

    //
    public static Singleton getInstance(){
        if (singleton == null){
            synchronized (Singleton.class){
                if (singleton == null){
                    singleton = new Singleton();
                }
            }

        }

        return singleton;

    }


}
