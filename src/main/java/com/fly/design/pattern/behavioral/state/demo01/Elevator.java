package com.fly.design.pattern.behavioral.state.demo01;

/**
 * 上下文类: 电梯
 * Created by fengxuguang on 2024/12/25 13:50
 */
public class Elevator {

    private ElevatorState state;

    public Elevator() {
        // 初始状态为 关门状态
        state = new CloseState();
    }

    public void setState(ElevatorState state) {
        this.state = state;
    }

    public void openDoors() {
        state.openDoors();
        this.state = new OpenState();
    }

    public void closeDoors() {
        state.closeDoors();
        this.state = new CloseState();
    }

    public void move() {
        state.move();
    }

    public void stop() {
        state.stop();
    }
}
