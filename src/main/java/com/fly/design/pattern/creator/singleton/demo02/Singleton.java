package com.fly.design.pattern.creator.singleton.demo02;

/**
 * 饿汉式: 静态代码块
 * <p>存在问题: 浪费内存</p>
 * Created by fengxuguang on 2024/2/5 14:22
 */
public class Singleton {

    private Singleton() {}

    // 声明 Singleton 类型的变量
    private static Singleton instance;

    // 在静态代码块中进行赋值
    static {
        instance = new Singleton();
    }

    public static Singleton getInstance() {
        return instance;
    }

}
