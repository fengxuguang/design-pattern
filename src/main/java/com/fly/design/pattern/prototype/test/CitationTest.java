package com.fly.design.pattern.prototype.test;


/**
 *
 * Created by fengxuguang on 2024/1/12 20:01
 */
public class CitationTest {

    public static void main(String[] args) throws CloneNotSupportedException {
        // 1. 创建原型对象
        Citation citation = new Citation();

        // 2. 克隆对象
        Citation clone = citation.clone();

        citation.setName("张三");
        clone.setName("李四");

        citation.show();
        clone.show();
    }

}
