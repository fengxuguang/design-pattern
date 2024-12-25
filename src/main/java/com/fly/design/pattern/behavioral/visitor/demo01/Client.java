package com.fly.design.pattern.behavioral.visitor.demo01;

/**
 * 访问者模式允许我们在不修改形状类的情况下, 通过实现不同的访问者来执行不同的操作, 例如计算面积.
 * 这样, 我们可以轻松地添加新的访问者来执行其他操作, 同时保持形状类的不变.
 *
 * Created by fengxuguang on 2024/12/25 16:25
 */
public class Client {

    public static void main(String[] args) {
        Circle circle = new Circle(5);
        Rectangle rectangle = new Rectangle(4, 6);

        AreaCalculator areaCalculator = new AreaCalculator();
        circle.accept(areaCalculator);
        rectangle.accept(areaCalculator);

        System.out.println("Total area: " + areaCalculator.getArea());
    }

}
