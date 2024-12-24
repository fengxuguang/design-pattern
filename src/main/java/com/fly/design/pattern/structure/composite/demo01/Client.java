package com.fly.design.pattern.structure.composite.demo01;

/**
 * Created by fengxuguang on 2024/12/24 11:01
 */
public class Client {

    public static void main(String[] args) {
        // 创建文件和文件夹
        File file1 = new File("file1.txt");
        File file2 = new File("file2.txt");

        Directory subdirectory = new Directory("Subdirectory");
        subdirectory.addComponent(file1);
        subdirectory.addComponent(file2);

        Directory rootDirectory = new Directory("Root");
        rootDirectory.addComponent(subdirectory);

        // 展示文件系统结构
        rootDirectory.displayInfo();
    }

}
