package com.fly.design.pattern.behavioral.observer.demo01;

/**
 * 主题接口
 *
 * Created by fengxuguang on 2024/12/25 11:36
 */
public interface Subject {

    void addObserver(Observer observer);

    void removeObserver(Observer observer);

    void notifyObservers();

}
