package com.imooc.design.singleton;


/**
 * 2 * @Author: Roger
 * 3 * @Date: 2018/9/19 0019 21:57
 * 4   懒汉式 加载类时比较快,运行时获取对象比较慢 线程不安全
 */
public class Singleton2 {

    private Singleton2(){

    }

    private static Singleton2 instance;

    public static Singleton2 getInstance() {
        if(instance == null){
            instance = new Singleton2();
        }
        return instance;
    }
}
