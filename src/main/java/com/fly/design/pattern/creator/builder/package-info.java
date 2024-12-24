/**
 * 建造者模式: 将一个复杂对象的构建与它的表示分离, 使得同样的构建过程可以创建不同的表示
 *
 * 建造者模式提供了一种将一个复杂对象的构建过程与其表示分离的方法. 它将对象的构建过程封装在一个独立的 “建造者” 类中, 由该类负责逐步构建对象.
 * 这样, 可以根据需要创建不同的建造者来构建不同的对象变体.
 * 建造者模式涉及以下角色:
 *   1. 产品 (Product): 表示正在构建的复杂对象. 建造者模式的目标是构建这个产品
 *   2. 抽象建造者 (Abstract Builder): 定义了构建产品的步骤和方法, 但没有具体的实现.
 *      不同的具体建造者可以实现不同的构建步骤, 从而创建不同的产品变体
 *   3. 具体建造者 (Concrete Builder): 实现了抽象建造者定义的方法，完成了产品的构建过程. 每个具体建造者负责构建特定的产品变体
 *   4. 指导者 (Director): 负责空着建造的过程. 它他国将客户端与具体建造者分离, 确保产品的构建是按照一定顺序和规则进行的
 *
 *
 * Created by fengxuguang on 2024/1/12 20:28
 */
package com.fly.design.pattern.creator.builder;