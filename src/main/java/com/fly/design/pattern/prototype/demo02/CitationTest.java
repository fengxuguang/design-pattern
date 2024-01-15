package com.fly.design.pattern.prototype.demo02;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * 深克隆方式
 * <p>
 * 注意：Citation 类和 Student 类必须实现 Serializable 接口, 否则会抛 NotSerializableException 异常
 * <p>
 * Created by fengxuguang on 2024/1/12 20:01
 */
public class CitationTest {

    public static void main(String[] args) throws Exception {
        // 1. 创建原型对象
        Citation citation = new Citation();

        Student student = new Student();
        student.setName("张三");
        citation.setStudent(student);

        // 2. 克隆对象
        String filepath = "C:/Users/0422120001/Documents/test.txt";
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filepath));
        oos.writeObject(citation);
        oos.close();

        ObjectInputStream ios = new ObjectInputStream(new FileInputStream(filepath));
        Citation clone = (Citation) ios.readObject();
        clone.getStudent().setName("李四");
        ios.close();

        citation.show();
        clone.show();
    }

}
