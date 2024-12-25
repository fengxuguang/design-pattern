package com.fly.design.pattern.behavioral.interpreter.demo01;

/**
 * 此例子构建了一个简单的数学表达式解释器, 用于解释并计算基本的加法和减法表达式
 * 这里展示了解释器模式如何工作, 将表达式解释成实际的结果
 * 在实际应用中, 解释器模式可以用于更复杂的领域, 如编程语言解释器 或 规则引擎
 *
 * Created by fengxuguang on 2024/12/24 16:21
 */
public class Client {

    public static void main(String[] args) {
        // 构建表达式: 10 + (8 - 4)
        Expression expression = new AddExpression(
                new NumberExpression(10),
                new SubtractExpression(
                        new NumberExpression(8),
                        new NumberExpression(4))
        );

        int result = expression.interpret();
        System.out.println(result);
    }

}
