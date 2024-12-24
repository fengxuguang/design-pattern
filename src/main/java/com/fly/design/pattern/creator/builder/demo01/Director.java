package com.fly.design.pattern.creator.builder.demo01;

/**
 *  指挥者类
 * Created by fengxuguang on 2024/1/12 20:36
 */
public class Director {

    // 声明 Builder 类型的变量
    private Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    // 组装自行车的功能
    public Bike construct() {
        builder.buildFrame();
        builder.buildSeat();
        return builder.createBike();
    }

}
