package com.fly.design.pattern.creator.abstractFactory.demo01;

/**
 * 生产美式咖啡、抹茶慕斯 工厂
 * Created by fengxuguang on 2024/12/23 16:50
 */
public class AmericanDessertFactory extends DessertFactory {

    /**
     * 生产美式咖啡
     */
    @Override
    public Coffee createCoffee() {
        return new AmericanCoffee();
    }

    /**
     * 生产抹茶慕斯
     */
    @Override
    public Dessert createDessert() {
        return new MatchaMousse();
    }
}
