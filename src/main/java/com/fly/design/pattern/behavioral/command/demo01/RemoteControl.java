package com.fly.design.pattern.behavioral.command.demo01;

/**
 * 遥控器类
 *
 * Created by fengxuguang on 2024/12/24 17:45
 */
public class RemoteControl {

    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void pressButton() {
        command.execute();
    }

}
