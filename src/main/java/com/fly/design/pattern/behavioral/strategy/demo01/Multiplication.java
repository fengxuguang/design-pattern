package com.fly.design.pattern.behavioral.strategy.demo01;

/**
 * 乘法策略
 *
 * Created by fengxuguang on 2024/12/25 16:11
 */
public class Multiplication implements MathOperation {
    @Override
    public int operate(int a, int b) {
        return a * b;
    }
}
