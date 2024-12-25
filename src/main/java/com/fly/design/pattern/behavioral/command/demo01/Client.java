package com.fly.design.pattern.behavioral.command.demo01;

/**
 * Created by fengxuguang on 2024/12/24 17:49
 */
public class Client {

    public static void main(String[] args) {
        Light light = new Light();

        LightOnCommand lightOn = new LightOnCommand(light);
        LightOffCommand lightOff = new LightOffCommand(light);

        RemoteControl remote = new RemoteControl();

        remote.setCommand(lightOn);
        remote.pressButton();

        remote.setCommand(lightOff);
        remote.pressButton();
    }

}
