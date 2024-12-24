package com.fly.design.pattern.creator.abstractFactory.demo01;

/**
 * 生产咖啡、甜品类工厂
 * Created by fengxuguang on 2024/12/23 16:47
 */
public abstract class DessertFactory {

    /**
     * 生产咖啡
     */
    public abstract Coffee createCoffee();

    /**
     * 生产甜品
     */
    public abstract Dessert createDessert();

}
