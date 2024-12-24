package com.fly.design.pattern.structure.flyweight.demo01;


/**
 * 具体享元类
 * Created by fengxuguang on 2024/12/24 15:27
 */
public class Circle implements Shape {

    private Color color;

    public Circle(Color color) {
        this.color = color;
    }

    @Override
    public void draw(int x, int y) {
        System.out.println("Drawing a " + color + " circle at (" + x + "," + y + ")");
    }
}
