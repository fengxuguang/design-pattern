package com.fly.design.pattern.creator.factoryMethod.demo01;

/**
 * 圆形工厂类
 * Created by fengxuguang on 2024/12/23 15:26
 */
public class CircleFactory extends ShapeFactory{
    @Override
    Shape createShape() {
        return new Circle();
    }
}
