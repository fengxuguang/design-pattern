package com.fly.design.pattern.structure.decorator.demo01;

/**
 * Created by fengxuguang on 2024/12/24 14:19
 */
public class MilkDecorator extends CoffeeDecorator {

    public MilkDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public double cost() {
        return super.cost() + 1.0;
    }

    @Override
    public String description() {
        return super.description() + ", with Milk";
    }
}
