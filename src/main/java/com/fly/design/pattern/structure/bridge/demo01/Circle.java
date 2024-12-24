package com.fly.design.pattern.structure.bridge.demo01;


/**
 * Created by fengxuguang on 2024/12/24 9:38
 */
public class Circle extends Shape {

    public Circle(Color color) {
        super(color);
    }

    @Override
    public void draw() {
        System.out.println("drawing a circle.");
        color.applyColor();
    }

}
