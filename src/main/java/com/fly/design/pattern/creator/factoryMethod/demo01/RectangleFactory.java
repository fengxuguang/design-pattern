package com.fly.design.pattern.creator.factoryMethod.demo01;

/**
 * 矩形工厂类
 * Created by fengxuguang on 2024/12/23 15:27
 */
public class RectangleFactory extends ShapeFactory{
    @Override
    Shape createShape() {
        return new Rectangle();
    }
}
