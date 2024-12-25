package com.fly.design.pattern.behavioral.visitor.demo01;

/**
 * 图形形状接口
 *
 * Created by fengxuguang on 2024/12/25 16:20
 */
public interface Shape {

    void accept(ShapeVisitor visitor);

}
