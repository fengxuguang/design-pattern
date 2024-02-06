package com.fly.design.pattern.creator.singleton.demo03;

/**
 * 懒汉式: 线程安全
 * Created by fengxuguang on 2024/2/5 15:05
 */
public class Singleton {

    // 私有构造方法
    private Singleton() {}

    // 声明 Singleton 类型的变量 instance
    private static Singleton instance;

    // 对外提供访问方式
    public static synchronized Singleton getInstance() {
        // 判断 instance 是否为 null, 如果为 null, 说明还没有创建 Singleton 类的对象
        // 如果没有, 创建一个并返回, 如果有, 直接返回
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

}
