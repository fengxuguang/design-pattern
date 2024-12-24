package com.fly.design.pattern.structure.proxy.demo01;

/**
 * Created by fengxuguang on 2024/12/24 15:53
 */
public class RealImage implements Image {

    private String filename;

    public RealImage(String filename) {
        this.filename = filename;
        loadImageFromDisk();
    }

    private void loadImageFromDisk() {
        System.out.println("Loading image from disk: " + filename);
    }

    @Override
    public void display() {
        System.out.println("Display image: " + filename);
    }
}
