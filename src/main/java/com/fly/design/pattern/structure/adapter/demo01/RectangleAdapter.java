package com.fly.design.pattern.structure.adapter.demo01;

/**
 * Created by fengxuguang on 2024/12/24 9:24
 */
public class RectangleAdapter implements Shape {

    private LegacyRectangle legacyRectangle;

    public RectangleAdapter(LegacyRectangle legacyRectangle) {
        this.legacyRectangle = legacyRectangle;
    }

    @Override
    public void draw(int x, int y, int width, int height) {
        int x1 = x;
        int y1 = y;
        int x2 = x + width;
        int y2 = y + height;
        legacyRectangle.display(x1, y1, x2, y2);
    }
}
