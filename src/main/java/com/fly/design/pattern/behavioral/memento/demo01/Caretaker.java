package com.fly.design.pattern.behavioral.memento.demo01;

/**
 * 管理者类
 *
 * Created by fengxuguang on 2024/12/25 10:15
 */
public class Caretaker {

    private Memento memento;

    public Memento getMemento() {
        return memento;
    }

    public void setMemento(Memento memento) {
        this.memento = memento;
    }
}
