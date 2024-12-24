package com.fly.design.pattern.structure.flyweight.demo01;


/**
 * Created by fengxuguang on 2024/12/24 15:38
 */
public class Client {

    public static void main(String[] args) {
        Color[] colors = {Color.RED, Color.GREEN, Color.BLUE, Color.YELLOW};

        for (int i = 0; i < 20; i++) {
            Color randomColor = colors[(int) (Math.random() * colors.length)];
            Shape circle = ShapeFactory.getCircle(randomColor);
            circle.draw((int) (Math.random() * 100), (int) (Math.random() * 100));
        }
    }

}
