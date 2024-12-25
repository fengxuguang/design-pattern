package com.fly.design.pattern.behavioral.strategy.demo01;

/**
 * Created by fengxuguang on 2024/12/25 16:12
 */
public class Calculator {

    private MathOperation operation;

    public void setOperation(MathOperation operation) {
        this.operation = operation;
    }

    public int performOperation(int a, int b) {
        if (operation != null) {
            return operation.operate(a, b);
        }
        throw new IllegalStateException("No operation set");
    }
}
