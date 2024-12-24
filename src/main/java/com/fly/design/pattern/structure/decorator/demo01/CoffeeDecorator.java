package com.fly.design.pattern.structure.decorator.demo01;

/**
 * 装饰器抽象类
 *
 * Created by fengxuguang on 2024/12/24 14:18
 */
public abstract class CoffeeDecorator implements Coffee {

    protected Coffee decorator;

    public CoffeeDecorator(Coffee coffee) {
        this.decorator = coffee;
    }

    @Override
    public double cost() {
        return decorator.cost();
    }

    @Override
    public String description() {
        return decorator.description();
    }
}
