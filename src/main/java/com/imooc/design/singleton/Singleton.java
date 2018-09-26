package com.imooc.design.singleton;


import org.hibernate.validator.internal.util.stereotypes.ThreadSafe;

/**
 * 2 * @Author: Roger
 * 3 * @Date: 2018/9/19 0019 21:57
 * 4   饥汉式 加载类时比较慢,运行时获取速度较快, 线程安全
 */
public class Singleton {

    private Singleton(){

    }

    private static Singleton instance = new Singleton();

    public static Singleton getInstance(){
        return instance;
    }
}
