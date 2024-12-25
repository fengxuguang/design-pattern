package com.fly.design.pattern.behavioral.command.demo01;

/**
 * 具体命令: 控制电灯打开
 * Created by fengxuguang on 2024/12/24 17:43
 */
public class LightOnCommand implements Command {

    private Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.turnOn();
    }
}
