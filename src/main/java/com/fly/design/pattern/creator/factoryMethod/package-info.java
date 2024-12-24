/**
 * 工厂方法模式: 定义一个用于创建对象的接口, 让子类决定将哪一个类实例化. Factory Method 使一个类的实例化延迟到其子类
 *
 * 优点: 工厂方法模式提供了一个创建对象的接口, 将具体的对象创建延迟到子类中. 这样, 客户端代码不需要知道要创建的具体
 *    对象的类, 只需要通过工厂方法来创建对象. 这使得客户端代码与具体对象的创建解耦, 提高了代码的灵活性和可维护性
 *
 * 缺点: 工厂方法模式可能引入一些额外的复杂性, 因为需要定义多个工厂类和产品类的层次结构. 这可能会导致系统中类的数量增加.
 *
 * Created by fengxuguang on 2024/12/23 15:08
 */
package com.fly.design.pattern.creator.factoryMethod;