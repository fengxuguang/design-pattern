package com.fly.design.pattern.behavioral.state.demo01;

/**
 * 模拟电梯系统, 其中有开门状态和关门状态两个具体状态类, 以及电梯类作为上下文类
 * 通过切换状态, 电梯在不同状态下有不同的行为表现.
 * 这就是状态模式的基本思想.
 *
 * Created by fengxuguang on 2024/12/25 13:52
 */
public class Client {

    public static void main(String[] args) {
        Elevator elevator = new Elevator();

        elevator.openDoors();   // 当前状态: 开门
        elevator.move();    // 当前状态: 开门, 无法移动

        elevator.closeDoors();  // 当前状态: 关门
        elevator.move();    // 当前状态: 移动中

        elevator.stop();    // 当前状态: 停止
        elevator.openDoors();   // 当前状态: 开门
    }

}
