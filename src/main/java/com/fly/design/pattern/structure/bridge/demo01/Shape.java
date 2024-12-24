package com.fly.design.pattern.structure.bridge.demo01;

/**
 * Created by fengxuguang on 2024/12/24 9:37
 */
public abstract class Shape {

    protected Color color;

    public Shape(Color color) {
        this.color = color;
    }

    public abstract void draw();

}
