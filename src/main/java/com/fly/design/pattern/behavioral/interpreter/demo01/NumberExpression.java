package com.fly.design.pattern.behavioral.interpreter.demo01;

/**
 * 数字表达式
 *
 * Created by fengxuguang on 2024/12/24 16:17
 */
public class NumberExpression implements Expression {

    private int value;

    public NumberExpression(int value) {
        this.value = value;
    }

    @Override
    public int interpret() {
        return value;
    }
}
