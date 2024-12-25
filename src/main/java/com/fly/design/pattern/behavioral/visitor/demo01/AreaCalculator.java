package com.fly.design.pattern.behavioral.visitor.demo01;

/**
 * Created by fengxuguang on 2024/12/25 16:24
 */
public class AreaCalculator implements ShapeVisitor {

    private double area;

    @Override
    public void visit(Circle circle) {
        area += Math.PI * circle.getRadius() * circle.getRadius();
    }

    @Override
    public void visit(Rectangle rectangle) {
        area += rectangle.getWidth() * rectangle.getHeight();
    }

    public double getArea() {
        return area;
    }
}
