package com.fly.design.pattern.creator.builder.demo01;

/**
 * 自行车
 * Created by fengxuguang on 2024/1/12 20:34
 */
public class MobileBuilder extends Builder{
    @Override
    public void buildFrame() {
        bike.setFrame("碳纤维车架");
    }

    @Override
    public void buildSeat() {
        bike.setSeat("真皮车座");
    }

    @Override
    public Bike createBike() {
        return bike;
    }
}
