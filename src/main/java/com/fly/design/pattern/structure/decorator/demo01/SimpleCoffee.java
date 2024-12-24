package com.fly.design.pattern.structure.decorator.demo01;

/**
 * Created by fengxuguang on 2024/12/24 14:17
 */
public class SimpleCoffee implements Coffee {
    @Override
    public double cost() {
        return 2.0;
    }

    @Override
    public String description() {
        return "this is simple coffee";
    }
}
