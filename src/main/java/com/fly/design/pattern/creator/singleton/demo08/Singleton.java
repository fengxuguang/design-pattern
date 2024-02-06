package com.fly.design.pattern.creator.singleton.demo08;

import java.io.Serializable;

/**
 * 懒汉式: 静态内部类
 * <p>静态内部类单例模式中实例由内部类创建, 由于 JVM 在加载外部类的过程中, 是不会加载静态内部类的, 只有内部类的属性/方法被调用时才会被加载,
 * 并初始化其静态属性. 静态属性由于被 static 修饰, 保证只被实例化一次, 并且严格保证实例化顺序.</p>
 * <br>
 * <p>说明: 第一次加载 Singleton 类时不会去初始化 INSTANCE, 只有第一次调用 getInstance, 虚拟机加载 SingletonHolder 并初始化 INSTANCE,
 * 这样不仅能确保线程安全, 也能保证 Singleton 类的唯一性. </p>
 * Created by fengxuguang on 2024/2/5 18:07
 */
public class Singleton implements Serializable {

    private static boolean flag = false;

    private Singleton() {

        synchronized (Singleton.class) {
            if (flag) {
                throw new RuntimeException("不能创建多个实例");
            }
            flag = true;
        }

    }

    private static class SingletonHolder {
        private static final Singleton instance = new Singleton();

    }

    public static Singleton getInstance() {
        return SingletonHolder.instance;
    }



}
