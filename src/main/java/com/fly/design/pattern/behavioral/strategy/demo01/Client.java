package com.fly.design.pattern.behavioral.strategy.demo01;

/**
 * Created by fengxuguang on 2024/12/25 16:13
 */
public class Client {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        calculator.setOperation(new Addition());
        int ret = calculator.performOperation(5, 3);
        System.out.println("ret = " + ret);

        calculator.setOperation(new Subtraction());
        int ret2 = calculator.performOperation(10, 4);
        System.out.println("ret2 = " + ret2);

        calculator.setOperation(new Multiplication());
        int ret3 = calculator.performOperation(6, 2);
        System.out.println("ret3 = " + ret3);


    }

}
