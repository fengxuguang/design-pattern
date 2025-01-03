/**
 * 模板方法模式: 通过定义一个抽象的父类, 其中包含了算法的核心结构, 但某些步骤使用抽象方法或受保护的虚拟方法来表示,
 * 这些方法由子类来实现. 这使得子类可以根据需要重写特定的步骤, 而核心算法结构保持不变. 父类中的模板方法调用这些步骤, 确保算法的整体流程一致.
 *
 * 模板方法模式的好处:
 *   1. 代码复用: 核心算法结构在父类中定义, 可以被多个子类共享, 避免了重复的代码
 *   2. 灵活性: 子类可以通过实现特定的步骤来定制算法的行为, 而不需要改变算法的整体结构
 *   3. 可维护性: 将算法的核心结构集中在一个地方, 易于维护和修改
 *   4. 代码一致性: 所有子类共享相同的算法模板, 确保了算法的一致性
 *
 *
 * Created by fengxuguang on 2024/12/24 16:30
 */
package com.fly.design.pattern.behavioral.templateMethod;