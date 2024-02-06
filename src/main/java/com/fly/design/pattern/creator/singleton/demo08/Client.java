package com.fly.design.pattern.creator.singleton.demo08;

import java.lang.reflect.Constructor;

/**
 * 测试使用反射破坏单例模式
 * <br/>
 *
 * <p>反射方式破坏单例模式的解决方案:</p>
 * <p></p>
 * Created by fengxuguang on 2024/2/6 9:37
 */
public class Client {

    public static void main(String[] args) throws Exception {
        // 1. 获取 Singleton 的字节码对象
        Class clazz = Singleton.class;
        
        // 2. 获取无参构造方法对象
        Constructor constructors = clazz.getDeclaredConstructor();

        // 3. 取消访问检查
        constructors.setAccessible(true);

        // 4. 创建 Singleton 对象
        Singleton sin = (Singleton) constructors.newInstance();
        Singleton sin2 = (Singleton) constructors.newInstance();

        System.out.println(sin);
        System.out.println(sin2);

        // 如果返回的是 true, 说明并没有破坏单例模式, 如果是 false, 说明破坏了单例模式
        System.out.println(sin == sin2);
    }
    
}
