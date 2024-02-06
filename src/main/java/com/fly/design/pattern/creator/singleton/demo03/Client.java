package com.fly.design.pattern.creator.singleton.demo03;

/**
 *
 * Created by fengxuguang on 2024/2/5 15:08
 */
public class Client {

    public static void main(String[] args) {
        Singleton instance = Singleton.getInstance();

        Singleton instance1 = Singleton.getInstance();

        System.out.println(instance == instance1);
    }

}
