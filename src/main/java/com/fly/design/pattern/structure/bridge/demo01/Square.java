package com.fly.design.pattern.structure.bridge.demo01;

/**
 * Created by fengxuguang on 2024/12/24 9:39
 */
public class Square extends Shape {

    public Square(Color color) {
        super(color);
    }

    @Override
    public void draw() {
        System.out.println("drawing a square");
        color.applyColor();
    }
}
