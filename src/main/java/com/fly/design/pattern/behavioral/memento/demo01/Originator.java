package com.fly.design.pattern.behavioral.memento.demo01;

/**
 * 原始对象类
 *
 * Created by fengxuguang on 2024/12/25 10:13
 */
public class Originator {

    private String state;

    public void setState(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }

    public Memento createMemento() {
        return new Memento(state);
    }

    public void restoreMemento(Memento memento) {
        state = memento.getState();
    }
}
