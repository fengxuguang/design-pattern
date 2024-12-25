package com.fly.design.pattern.behavioral.state.demo01;

/**
 * 具体状态类: 开门状态
 *
 * Created by fengxuguang on 2024/12/25 11:54
 */
public class OpenState implements ElevatorState {
    @Override
    public void openDoors() {
        System.out.println("Doors are already open.");
    }

    @Override
    public void closeDoors() {
        System.out.println("Closing doors.");
    }

    @Override
    public void move() {
        System.out.println("Can't move while doors are open.");
    }

    @Override
    public void stop() {
        System.out.println("Stopping while doors are open.");
    }
}
