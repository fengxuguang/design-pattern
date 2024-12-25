package com.fly.design.pattern.behavioral.mediator.demo01;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by fengxuguang on 2024/12/25 9:52
 */
public class ConcreteChatMediator implements ChatMediator {

    private List<User> users = new ArrayList<>();

    @Override
    public void sendMessage(String message, User user) {
        for (User u : users) {
            if (u != user) {
                u.receiveMessage(message);
            }
        }
    }

    @Override
    public void addUser(User user) {
        users.add(user);
    }
}
