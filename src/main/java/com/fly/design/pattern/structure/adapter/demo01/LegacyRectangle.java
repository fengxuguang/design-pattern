package com.fly.design.pattern.structure.adapter.demo01;

/**
 * Created by fengxuguang on 2024/12/24 9:22
 */
public class LegacyRectangle {

    public void display(int x1, int y1, int x2, int y2) {
        System.out.println("LegacyRectangle: Point(" + x1 + ", " + y1 + "), Point(" + x2 + ", " + y2 + ")");
    }

}
