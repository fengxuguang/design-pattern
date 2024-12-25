package com.fly.design.pattern.behavioral.mediator.demo01;

/**
 * ConcreteChatMediator 实现了 ChatMediator 接口, 并管理用户列表.
 * 每个用户对象在构造时都传递了中介者实例, 以便用户可以使用中介者发送和接收消息
 *
 * Created by fengxuguang on 2024/12/25 9:54
 */
public class Client {

    public static void main(String[] args) {
        ConcreteChatMediator concreteChatMediator = new ConcreteChatMediator();

        User amy = new User("Amy", concreteChatMediator);
        User tom = new User("Tom", concreteChatMediator);
        User john = new User("John", concreteChatMediator);

        concreteChatMediator.addUser(amy);
        concreteChatMediator.addUser(tom);
        concreteChatMediator.addUser(john);

        amy.sendMessage("大家好！");
        tom.sendMessage("你好, Amy!");
    }

}
