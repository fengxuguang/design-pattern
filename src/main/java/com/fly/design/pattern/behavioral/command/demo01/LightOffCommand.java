package com.fly.design.pattern.behavioral.command.demo01;

/**
 * 具体命令: 控制电灯关闭
 *
 * Created by fengxuguang on 2024/12/24 17:45
 */
public class LightOffCommand implements Command {

    private Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.turnOff();
    }
}
