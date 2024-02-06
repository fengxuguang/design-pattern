package com.fly.design.pattern.creator.singleton.demo04;

/**
 * 懒汉式: 双重检查锁(线程安全)
 * <p>双重检查锁模式是一种非常好的单例实现模式, 解决了单例、性能、线程安全问题, 上面的双重检测锁看上去完美无缺, 其实是存在问题,
 * 在多线程的情况下, 可能会出现空指针问题, 出现问题的原因是 JVM 在实例化对象的时候会进行优化和指令重排操作. </p>
 *
 * <p>要解决双重检查锁模式带来的空指针异常的问题, 只需要使用 volatile 关键字, volatile 关键字可以保证可见性和有序性</p>
 * Created by fengxuguang on 2024/2/5 15:13
 */
public class Singleton {

    private Singleton() {}

    private static volatile Singleton instance;

    public static Singleton getInstance() {
        // 第一次判断, 如果 instance 不为 null, 不进入抢锁阶段, 直接返回实例
        if (instance == null) {
            synchronized (Singleton.class) {
                // 抢到锁之后再次判断是否为 null
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }

        return instance;
    }

}
