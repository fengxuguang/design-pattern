package com.fly.design.pattern.structure.composite.demo01;

import java.util.ArrayList;
import java.util.List;

/**
 * 容器节点
 *
 * Created by fengxuguang on 2024/12/24 10:56
 */
public class Directory implements FileSystemComponent {

    private String name;
    private List<FileSystemComponent> components;

    public Directory(String name) {
        this.name = name;
        components = new ArrayList<>();
    }

    public void addComponent(FileSystemComponent component) {
        components.add(component);
    }

    @Override
    public void displayInfo() {
        System.out.println("Directory: " +name);
        for (FileSystemComponent component : components) {
            component.displayInfo();
        }
    }
}
