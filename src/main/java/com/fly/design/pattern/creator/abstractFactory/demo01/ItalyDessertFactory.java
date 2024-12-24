package com.fly.design.pattern.creator.abstractFactory.demo01;

/**
 * 意大利风味甜品工厂
 * Created by fengxuguang on 2024/12/23 16:49
 */
public class ItalyDessertFactory extends DessertFactory{

    /**
     * 生产拿铁咖啡
     */
    @Override
    public Coffee createCoffee() {
        return new LatteCoffee();
    }

    /**
     * 生产提拉米苏
     */
    @Override
    public Dessert createDessert() {
        return new Tiramisu();
    }
}
