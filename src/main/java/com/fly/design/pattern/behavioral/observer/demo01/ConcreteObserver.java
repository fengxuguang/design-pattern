package com.fly.design.pattern.behavioral.observer.demo01;

/**
 * Created by fengxuguang on 2024/12/25 11:40
 */
public class ConcreteObserver implements Observer {

    private String name;

    public ConcreteObserver(String name) {
        this.name = name;
    }

    @Override
    public void update(int state) {
        System.out.println(name + " 收到更新, 新状态为: " + state);
    }
}
