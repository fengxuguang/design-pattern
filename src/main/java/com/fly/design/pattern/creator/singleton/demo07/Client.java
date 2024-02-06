package com.fly.design.pattern.creator.singleton.demo07;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * 测试使用序列化、反序列化破坏单例模式
 * <br/>
 *
 * <p>序列化、反序列化破坏单例模式的解决方案:</p>
 * <p>在 Singleton 类中添加 readResolve() 方法, 在反序列化时被反射调用, 如果定义了这个方法, 就返回这个方法的值, 如果没有定义, 则返回新 new 出来的对象</p>
 * Created by fengxuguang on 2024/2/5 18:20
 */
public class Client {

    public static void main(String[] args) throws Exception {
        writeObject2File();
        readObjectFromFile();

        readObjectFromFile();
    }

    // 从文件读取数据(对象)
    public static void readObjectFromFile() throws Exception {
        // 1. 创建对象输入流对象
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("C:\\Users\\0422120001\\Downloads\\a.txt"));

        // 2. 读取对象
        Singleton instance = (Singleton) ois.readObject();

        System.out.println(instance);

        // 3. 释放资源
        ois.close();
    }

    // 向文件中写数据(对象)
    public static void writeObject2File() throws Exception {
        // 1. 获取 Singleton 对象
        Singleton instance = Singleton.getInstance();

        // 2. 创建对象输出流对象
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("C:\\Users\\0422120001\\Downloads\\a.txt"));
        // 3. 写对象
        oos.writeObject(instance);

        // 4. 释放资源
        oos.close();
    }

}
