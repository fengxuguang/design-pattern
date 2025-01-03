package com.fly.design.pattern.creator.builder.demo01;

/**
 * Ofo 共享单车
 * Created by fengxuguang on 2024/1/12 20:35
 */
public class OfoBuilder extends Builder{
    @Override
    public void buildFrame() {
        bike.setFrame("铝合金车架");
    }

    @Override
    public void buildSeat() {
        bike.setSeat("橡胶车座");
    }

    @Override
    public Bike createBike() {
        return bike;
    }
}
