package com.fly.design.pattern.behavioral.memento.demo01;

/**
 * Originator 类表示原始对象, 它具有状态并能够创建和恢复备忘录.
 * Memento 类表示备忘录对象, 保存了特定时刻的状态. Caretaker 类负责保存和获取备忘录对象.
 * 通过设置初始状态、创建备忘录、修改状态、然后恢复状态, 我们可以看到备忘录模式的工作方式.
 *
 * Created by fengxuguang on 2024/12/25 10:15
 */
public class Client {

    public static void main(String[] args) {
        Originator originator = new Originator();
        Caretaker caretaker = new Caretaker();

        // 设置初始状态
        originator.setState("State 1");
        System.out.println("Current State: " + originator.getState());

        // 创建备忘录并保存状态
        caretaker.setMemento(originator.createMemento());

        // 修改状态
        originator.setState("State 2");
        System.out.println("Updated State: " + originator.getState());

        // 恢复之前的状态
        originator.restoreMemento(caretaker.getMemento());
        System.out.println("Restored State: " + originator.getState());
    }

}
