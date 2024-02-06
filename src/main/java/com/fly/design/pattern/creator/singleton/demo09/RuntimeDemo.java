package com.fly.design.pattern.creator.singleton.demo09;

import java.io.IOException;
import java.io.InputStream;

/**
 *
 * Created by fengxuguang on 2024/2/6 10:11
 */
public class RuntimeDemo {

    public static void main(String[] args) throws IOException {
        // 获取 Runtime 类的对象
        Runtime runtime = Runtime.getRuntime();

        // 调用 runtime 的方法 exec, 参数需要一个命令
        Process process = runtime.exec("ipconfig");

        // 调用 process 对象的获取输入流的方法
        InputStream is = process.getInputStream();
        byte[] arr = new byte[1024 * 1024 * 100];

        // 读取数据
        int len = is.read(arr);

        // 将字节数组转换为字符串输出到控制台
        System.out.println(new String(arr, 0, len, "GBK"));
    }

}
