package com.fly.design.pattern.behavioral.interpreter.demo01;

/**
 * 加法表达式类
 *
 * Created by fengxuguang on 2024/12/24 16:18
 */
public class AddExpression implements Expression {

    private Expression leftExpression;
    private Expression rightExpression;

    public AddExpression(Expression leftExpression, Expression rightExpression) {
        this.leftExpression = leftExpression;
        this.rightExpression = rightExpression;
    }

    @Override
    public int interpret() {
        return leftExpression.interpret() + rightExpression.interpret();
    }
}
