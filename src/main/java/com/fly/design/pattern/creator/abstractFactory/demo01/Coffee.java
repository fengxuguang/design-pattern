package com.fly.design.pattern.creator.abstractFactory.demo01;

/**
 * 抽象咖啡类
 * Created by fengxuguang on 2024/12/23 16:11
 */
public abstract class Coffee {

    /**
     * 获取咖啡名称
     */
    public abstract String getName();

    /**
     * 加奶
     */
    public void addMilk() {
        System.out.println("加奶...");
    }

    /**
     * 加糖
     */
    public void addSugar() {
        System.out.println("加糖...");
    }

}
