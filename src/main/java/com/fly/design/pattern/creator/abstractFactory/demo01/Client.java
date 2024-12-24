package com.fly.design.pattern.creator.abstractFactory.demo01;

/**
 * Created by fengxuguang on 2024/12/23 16:56
 */
public class Client {

    public static void main(String[] args) {
        // 创建 意大利风味甜品工厂
        ItalyDessertFactory factory = new ItalyDessertFactory();

        // 获取拿铁咖啡
        Coffee coffee = factory.createCoffee();
        System.out.println(coffee.getName());

        // 获取提拉米苏
        Dessert dessert = factory.createDessert();
        dessert.show();

        AmericanDessertFactory dessertFactory = new AmericanDessertFactory();
        // 获取美式咖啡
        Coffee coffee1 = dessertFactory.createCoffee();
        System.out.println(coffee1.getName());

        // 获取抹茶慕斯
        Dessert dessert1 = dessertFactory.createDessert();
        dessert1.show();

    }

}
