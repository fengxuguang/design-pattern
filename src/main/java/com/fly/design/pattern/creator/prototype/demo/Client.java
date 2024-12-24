package com.fly.design.pattern.creator.prototype.demo;

/**
 *
 * Created by fengxuguang on 2024/1/12 19:56
 */
public class Client {

    public static void main(String[] args) throws CloneNotSupportedException {
        // 创建一个原型类对象
        Realizetype realizetype = new Realizetype();

        // 调用 Realizetype 类中的 clone 方法进行对象的克隆
        Realizetype clone = realizetype.clone();
        System.out.println(realizetype);
        System.out.println(clone);
        System.out.println("原型对象和克隆出来的是否是同一个对象：" + (realizetype == clone));
    }
}
