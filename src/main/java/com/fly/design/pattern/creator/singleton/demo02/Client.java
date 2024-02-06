package com.fly.design.pattern.creator.singleton.demo02;

/**
 *
 * Created by fengxuguang on 2024/2/5 14:24
 */
public class Client {

    public static void main(String[] args) {
        Singleton instance = Singleton.getInstance();

        Singleton instance1 = Singleton.getInstance();

        System.out.println(instance == instance1);
    }

}
