package com.fly.design.pattern.behavioral.visitor.demo01;

/**
 * 矩形类
 *
 * Created by fengxuguang on 2024/12/25 16:22
 */
public class Rectangle implements Shape {

    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    @Override
    public void accept(ShapeVisitor visitor) {
        visitor.visit(this);
    }
}
