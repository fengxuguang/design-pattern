package com.fly.design.pattern.structure.proxy.demo01;

/**
 * Image 接口定义了 display 方法, RealImage 是实际的图像加载类, 而 ProxyImage 是代理图像类.
 * 当 ProxyImage 的 display 方法被调用时, 它会在需要时创建一个 RealImage 实例, 并调用其 display 方法.
 * Created by fengxuguang on 2024/12/24 15:55
 */
public class Client {

    public static void main(String[] args) {
        Image image = new ProxyImage("text.jpg");

        // 图像未加载, 调用 display() 方法
        image.display();

        // 图像已加载, 无需再次创建
        image.display();
    }
}
