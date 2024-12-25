package com.fly.design.pattern.behavioral.visitor.demo01;

/**
 * 圆形类
 *
 * Created by fengxuguang on 2024/12/25 16:21
 */
public class Circle implements Shape {

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public void accept(ShapeVisitor visitor) {
        visitor.visit(this);
    }
}
