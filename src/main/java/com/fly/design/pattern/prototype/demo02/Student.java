package com.fly.design.pattern.prototype.demo02;

import java.io.Serializable;

/**
 *
 * Created by fengxuguang on 2024/1/12 20:05
 */
public class Student implements Serializable {

    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                '}';
    }
}
