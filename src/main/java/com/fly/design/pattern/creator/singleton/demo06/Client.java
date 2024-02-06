package com.fly.design.pattern.creator.singleton.demo06;


/**
 *
 * Created by fengxuguang on 2024/2/5 18:17
 */
public class Client {

    public static void main(String[] args) {
        Singleton instance = Singleton.INSTANCE;

        Singleton instance1 = Singleton.INSTANCE;

        System.out.println(instance == instance1);

        instance.test();
    }

}
