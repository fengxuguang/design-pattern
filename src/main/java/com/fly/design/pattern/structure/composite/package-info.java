/**
 * 组合模式: 将对象组合成树状结构, 其中树的节点可以是单个对象或对象组合.
 *
 * 组合模式中, 通常有两种主要角色:
 * 1. 组件 (Component): 抽象类或接口, 定义了单个对象和对象组合共同的操作. 它可以有一些默认实现, 也可以有抽象方法需要在具体子类中实现.
 * 2. 叶子 (Leaf): 继承自组件, 表示单个对象. 它没有子对象.
 * 3. 复合 (Composite): 继承自组件, 表示对象组合. 它包含了一组子对象, 这些子对象可以是叶子, 也可以是复合.
 *
 * 优点:
 *   1. 透明性: 使用组合模式, 客户端可以一致地对待单个对象和对象组合, 无需关心具体对象的类型
 *   2. 简化客户端代码: 客户端不需要判断惭怍的对象是单个对象还是对象组合, 从而简化了客户端的代码
 *   3. 灵活性: 可以很方便地添加新的叶子或复合对象, 扩展性较好.
 *
 * 缺点:
 *   1. 不适合所有情况: 并非所有情况都适合使用组合模式. 在一些情况下, 可能会引入不必要的复杂性
 *   2. 可能限制操作: 组合模式可能会限制某些特定对象的操作, 因为共同的抽象接口可能无法涵盖所有可能的操作.
 *
 * Created by fengxuguang on 2024/12/24 9:47
 */
package com.fly.design.pattern.structure.composite;