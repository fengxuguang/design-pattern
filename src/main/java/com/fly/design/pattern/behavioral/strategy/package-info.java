/**
 * 策略模式: 提供了一种定义一系列算法的方法, 将这些算法封装成独立的策略类, 并使它们可以相互替换.
 * 在客户端中, 创建一个上下文 (Context) 对象, 该对象包含一个对策略类的引用, 通过该引用调用相应的
 * 策略方法. 这样, 客户端可以在运行时选择不同的策略, 而不需要修改上下文类.
 *
 * 优点: 策略模式的主要优点是实现了算法的解耦, 使得算法可以独立于客户端而变化. 它提高了代码的可维护性和扩展性,
 *      因为新的策略可以很容易地添加到系统中.
 *
 * 缺点: 策略模式也可能导致类的数量增加, 因为每个算法都需要一个对应的策略类.
 *      在使用策略模式时, 需要权衡类的数量与灵活性之间的关系.
 *
 * Created by fengxuguang on 2024/12/25 14:04
 */
package com.fly.design.pattern.behavioral.strategy;