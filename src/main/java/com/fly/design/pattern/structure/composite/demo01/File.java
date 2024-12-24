package com.fly.design.pattern.structure.composite.demo01;

/**
 * 叶子节点
 *
 * Created by fengxuguang on 2024/12/24 10:52
 */
public class File implements FileSystemComponent {

    private String name;

    public File(String name) {
        this.name = name;
    }

    @Override
    public void displayInfo() {
        System.out.println("File: " + name);
    }
}
