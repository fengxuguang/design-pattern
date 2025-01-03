package com.fly.design.pattern.behavioral.mediator.demo01;

/**
 * 用户类
 *
 * Created by fengxuguang on 2024/12/25 9:50
 */
public class User {

    private String name;
    private ChatMediator mediator;

    public User(String name, ChatMediator mediator) {
        this.name = name;
        this.mediator = mediator;
    }

    public void sendMessage(String message) {
        System.out.println(name + " 发送消息: " + message);
        mediator.sendMessage(message, this);
    }

    public void receiveMessage(String message) {
        System.out.println(name + " 收到消息: " + message);
    }

}
