package com.fly.design.pattern.structure.decorator.demo01;

/**
 *
 * Coffee 接口定义了基本的咖啡功能. SimpleCoffee 类实现了基本的咖啡.
 * CoffeeDecorator 是装饰器的抽象类, 它维护了一个被装饰的咖啡对象.
 * MilkDecorator 和 SugarDecorator 分别实现了具体的装饰器, 通过在原始咖啡上添加新的功能.
 *
 * Created by fengxuguang on 2024/12/24 14:22
 */
public class Client {

    public static void main(String[] args) {
        Coffee simpleCoffee = new SimpleCoffee();
        System.out.println("Cost: $" + simpleCoffee.cost() + ", Description: " + simpleCoffee.description());

        Coffee milkCoffee = new MilkDecorator(simpleCoffee);
        System.out.println("Cost: $" + milkCoffee.cost() + ", Description: " + milkCoffee.description());

        Coffee sugarCoffee = new SugarDecorator(simpleCoffee);
        System.out.println("Cost: $" + sugarCoffee.cost() + ", Description: " + sugarCoffee.description());


    }

}
