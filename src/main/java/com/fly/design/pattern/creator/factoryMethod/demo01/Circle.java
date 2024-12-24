package com.fly.design.pattern.creator.factoryMethod.demo01;

/**
 * 圆形
 * Created by fengxuguang on 2024/12/23 15:20
 */
public class Circle implements Shape{
    @Override
    public void draw() {
        System.out.println("圆形");
    }
}
