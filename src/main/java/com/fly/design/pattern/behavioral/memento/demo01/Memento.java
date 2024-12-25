package com.fly.design.pattern.behavioral.memento.demo01;

/**
 * 备忘录类
 * Created by fengxuguang on 2024/12/25 10:13
 */
public class Memento {

    private String state;

    public Memento(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }

}
