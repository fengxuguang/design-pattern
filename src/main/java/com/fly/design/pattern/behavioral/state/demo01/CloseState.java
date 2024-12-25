package com.fly.design.pattern.behavioral.state.demo01;

/**
 * 具体状态类: 关门状态
 *
 * Created by fengxuguang on 2024/12/25 11:56
 */
public class CloseState implements ElevatorState {
    @Override
    public void openDoors() {
        System.out.println("Opening doors.");
    }

    @Override
    public void closeDoors() {
        System.out.println("Doors ");
    }

    @Override
    public void move() {
        System.out.println("Moving.");
    }

    @Override
    public void stop() {
        System.out.println("Stopping.");
    }
}
