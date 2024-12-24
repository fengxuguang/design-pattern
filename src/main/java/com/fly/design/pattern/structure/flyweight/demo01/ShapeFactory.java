package com.fly.design.pattern.structure.flyweight.demo01;


import java.util.HashMap;
import java.util.Map;

/**
 * 享元工厂类
 *
 * Created by fengxuguang on 2024/12/24 15:28
 */
public class ShapeFactory {

    private static final Map<Color, Shape> circleMap = new HashMap<>();

    public static Shape getCircle(Color color) {

        return circleMap.computeIfAbsent(color, Circle::new);
    }

}
