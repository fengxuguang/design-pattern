package com.fly.design.pattern.structure.bridge.demo01;

/**
 * Color 接口代表颜色的实现部分, Red 和 Blue 分别是实现了颜色接口的具体颜色类.
 * Shape 是形状的抽象部分, 具有一个颜色引用, 而 Circle 和 Square 是继承自 Shape 的具体形状类.
 * 这种设计允许我们在不改变形状或颜色的情况下, 独立地对它们进行扩展和变化.
 *
 * Created by fengxuguang on 2024/12/24 9:40
 */
public class Client {

    public static void main(String[] args) {
        Color redColor = new Red();
        Color blueColor = new Blue();

        Shape redCircle = new Circle(redColor);
        Shape blueSquare = new Circle(blueColor);

        redCircle.draw();
        blueSquare.draw();
    }

}
