package com.fly.design.pattern.behavioral.interpreter.demo01;

/**
 * 减法表达式类
 *
 * Created by fengxuguang on 2024/12/24 16:20
 */
public class SubtractExpression implements Expression {

    private Expression leftExpression;
    private Expression rightExpression;

    public SubtractExpression(Expression leftExpression, Expression rightExpression) {
        this.leftExpression = leftExpression;
        this.rightExpression = rightExpression;
    }

    @Override
    public int interpret() {
        return leftExpression.interpret() - rightExpression.interpret();
    }
}
