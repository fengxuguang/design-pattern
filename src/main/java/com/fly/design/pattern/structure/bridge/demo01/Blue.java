package com.fly.design.pattern.structure.bridge.demo01;

/**
 * Created by fengxuguang on 2024/12/24 9:35
 */
public class Blue implements Color {
    @Override
    public void applyColor() {
        System.out.println("applying blue color");
    }
}
