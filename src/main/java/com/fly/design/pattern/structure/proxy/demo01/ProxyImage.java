package com.fly.design.pattern.structure.proxy.demo01;

/**
 * 代理图像类
 *
 * Created by fengxuguang on 2024/12/24 15:54
 */
public class ProxyImage implements Image {

    private RealImage realImage;
    private String filename;

    public ProxyImage(String filename) {
        this.filename = filename;
    }

    @Override
    public void display() {
        if (realImage == null) {
            realImage = new RealImage(filename);
        }
        realImage.display();
    }
}
