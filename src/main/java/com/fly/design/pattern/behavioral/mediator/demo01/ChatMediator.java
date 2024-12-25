package com.fly.design.pattern.behavioral.mediator.demo01;

/**
 *
 * 中介者接口
 *
 * Created by fengxuguang on 2024/12/25 9:50
 */
public interface ChatMediator {

    void sendMessage(String message, User user);

    void addUser(User user);

}
