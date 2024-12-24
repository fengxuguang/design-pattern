package com.fly.design.pattern.structure.decorator.demo01;

/**
 * Created by fengxuguang on 2024/12/24 14:20
 */
public class SugarDecorator extends CoffeeDecorator {

    public SugarDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public double cost() {
        return super.cost() + 0.5;
    }

    @Override
    public String description() {
        return super.description() + ", with Sugar";
    }
}
