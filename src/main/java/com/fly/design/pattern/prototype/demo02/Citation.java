package com.fly.design.pattern.prototype.demo02;

import java.io.Serializable;

/**
 *
 * 使用场景：
 *      1. 对象的创建非常复杂, 可以使用原型模式快捷的创建对象
 *      2. 性能和安全要求比较高
 * Created by fengxuguang on 2024/1/12 19:59
 */
public class Citation implements Cloneable, Serializable {

    private Student student;

    public void setStudent(Student student) {
        this.student = student;
    }

    public Student getStudent() {
        return student;
    }

    public void show() {
        System.out.println(student.getName() + "同学：在 2024 学年第一学期中表现优秀，被评为三好学生。特发此状！");
    }

    @Override
    public Citation clone() throws CloneNotSupportedException {
        return (Citation) super.clone();
    }
}
