package com.fly.design.pattern.builder.demo01;

/**
 *
 * Created by fengxuguang on 2024/1/12 20:33
 */
public abstract class Builder {

    // 声明 Bike 类型的变量, 并进行赋值
    protected Bike bike = new Bike();

    public abstract void buildFrame();

    public abstract void buildSeat();

    public abstract Bike createBike();

}
