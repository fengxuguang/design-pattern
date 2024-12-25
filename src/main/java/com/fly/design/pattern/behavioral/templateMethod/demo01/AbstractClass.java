package com.fly.design.pattern.behavioral.templateMethod.demo01;

/**
 * 模板类
 *
 * Created by fengxuguang on 2024/12/24 16:37
 */
public abstract class AbstractClass {

    public void templateMethod() {
        step1();
        step2();
        step3();
    }

    abstract void step1();

    abstract void step2();

    abstract void step3();

}
