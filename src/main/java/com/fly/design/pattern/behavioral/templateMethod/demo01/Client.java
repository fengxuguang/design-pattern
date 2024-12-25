package com.fly.design.pattern.behavioral.templateMethod.demo01;

/**
 * Created by fengxuguang on 2024/12/24 16:39
 */
public class Client {

    public static void main(String[] args) {
        AbstractClass template = new ConcreteClass();

        template.templateMethod();
    }

}
