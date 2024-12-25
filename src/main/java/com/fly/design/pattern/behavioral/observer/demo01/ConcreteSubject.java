package com.fly.design.pattern.behavioral.observer.demo01;

import java.util.ArrayList;
import java.util.List;

/**
 * 具体主题类
 *
 * Created by fengxuguang on 2024/12/25 11:37
 */
public class ConcreteSubject implements Subject {

    private List<Observer> observers = new ArrayList<>();

    private int state;

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
        notifyObservers();
    }

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(state);
        }
    }
}
