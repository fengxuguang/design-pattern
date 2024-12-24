package com.fly.design.pattern.creator.builder.demo01;

/**
 *
 * Created by fengxuguang on 2024/1/12 20:32
 */
public class Bike {

    /**
     * 车架
     */
    private String frame;

    /**
     * 车座
     */
    private String seat;

    public void setFrame(String frame) {
        this.frame = frame;
    }

    public void setSeat(String seat) {
        this.seat = seat;
    }

    public String getFrame() {
        return frame;
    }

    public String getSeat() {
        return seat;
    }
}
