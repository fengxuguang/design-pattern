package com.fly.design.pattern.creator.singleton.demo01;

/**
 *
 * Created by fengxuguang on 2024/2/5 14:06
 */
public class Client {

    public static void main(String[] args) {
        Singleton instance = Singleton.getInstance();

        Singleton instance1 = Singleton.getInstance();

        // 判断获取到的两个对象是否是同一个
        System.out.println(instance == instance1);
    }

}
