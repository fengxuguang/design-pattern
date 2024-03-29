package com.fly.design.pattern.creator.singleton.demo06;

/**
 * <p>枚举类型属于饿汉式模式</p>
 * <br/>
 * <p>枚举类实现单例模式是极力推荐的单例实现模式, 因为枚举类型是线程安全的, 并且只会装载一次, 设计者充分的利用了枚举的这个特性来实现单例模式,
 * 枚举的写法非常简单, 而且枚举类型是所有单例实现中唯一一种不会被破坏的单例实现模式. </p>
 * Created by fengxuguang on 2024/2/5 18:15
 */
public enum Singleton {

    INSTANCE;

    public void test() {
        System.out.println("test");
    }

}
