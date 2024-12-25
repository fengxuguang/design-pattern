package com.fly.design.pattern.behavioral.templateMethod.demo01;

/**
 * Created by fengxuguang on 2024/12/24 16:39
 */
public class ConcreteClass extends AbstractClass {
    @Override
    void step1() {
        System.out.println("ConcreteClass: Step 1");
    }

    @Override
    void step2() {
        System.out.println("ConcreteClass: Step 2");
    }

    @Override
    void step3() {
        System.out.println("ConcreteClass: Step 3");
    }
}
