package com.fly.design.pattern.structure.adapter.demo01;

/**
 * Created by fengxuguang on 2024/12/24 9:26
 */
public class Client {

    public static void main(String[] args) {
        LegacyRectangle legacyRectangle = new LegacyRectangle();
        RectangleAdapter rectangleAdapter = new RectangleAdapter(legacyRectangle);

        rectangleAdapter.draw(10, 20, 50, 70);
    }

}
