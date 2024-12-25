package com.fly.design.pattern.behavioral.state.demo01;

/**
 * 状态接口
 *
 * Created by fengxuguang on 2024/12/25 11:54
 */
public interface ElevatorState {

    void openDoors();

    void closeDoors();

    void move();

    void stop();

}
