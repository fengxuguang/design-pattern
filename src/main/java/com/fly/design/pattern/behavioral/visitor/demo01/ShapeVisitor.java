package com.fly.design.pattern.behavioral.visitor.demo01;

/**
 * 访问者接口
 *
 * Created by fengxuguang on 2024/12/25 16:23
 */
public interface ShapeVisitor {

    void visit(Circle circle);

    void visit(Rectangle rectangle);

}
