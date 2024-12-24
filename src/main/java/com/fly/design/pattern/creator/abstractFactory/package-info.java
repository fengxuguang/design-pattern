/**
 * 抽象工厂模式: 提供一个创建一系列相关或相互依赖对象的接口, 而无需指定它们的具体的类
 *
 * 抽象工厂模式提供了一个接口, 用于创建一系列相关或相互依赖的对象. 通过使用抽象工厂接口及其具体实现,
 *   可以将对象的创建与客户端代码分离, 从而实现系统的松耦合. 抽象工厂模式涉及多个角色:
 *   1. 抽象工厂 (Abstract Factory): 声明了一组用于创建不同产品的抽象方法. 具体的工厂类必须实现这些方法来创建具体的产品对象
 *   2. 具体工厂 (Concrete Factory): 实现抽象工厂接口, 负责创建特定种类的产品对象
 *   3. 抽象产品 (Abstract Product): 定义了产品的通用接口, 具体产品必须实现这个接口
 *   4. 具体产品 (Concrete Product): 实现抽象产品接口, 是抽象工厂创建的实际对象
 *
 * 优点: 当一个产品族中的多个对象被设计成一起工作时, 它能保证客户端始终只使用同一个产品族中的对象
 *
 * 缺点: 当产品族中需要增加一个新的产品时, 所有的工厂类都需要进行修改
 *
 * Created by fengxuguang on 2024/12/23 15:07
 */
package com.fly.design.pattern.creator.abstractFactory;