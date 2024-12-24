package com.fly.design.pattern.creator.factoryMethod.demo01;

/**
 * Created by fengxuguang on 2024/12/23 15:30
 */
public class Client {

    public static void main(String[] args) {
        ShapeFactory circleFactory = new CircleFactory();
        Shape circle = circleFactory.createShape();
        circle.draw();

        ShapeFactory rectangleFactory = new RectangleFactory();
        Shape rectangle = rectangleFactory.createShape();
        rectangle.draw();
    }

}
