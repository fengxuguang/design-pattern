package com.fly.design.pattern.behavioral.observer.demo01;

/**
 * ConcreteSubject 充当主题 (被观察者), ConcreteObserver 充当观察者
 * 主题维护一个观察者列表, 并在状态变化时通知所有观察者
 * 当主题的状态发生变化时, 所有观察者都会被通知并更新自己的状态
 *
 * Created by fengxuguang on 2024/12/25 11:41
 */
public class Client {

    public static void main(String[] args) {
        ConcreteSubject subject = new ConcreteSubject();

        ConcreteObserver observer1 = new ConcreteObserver("观察者1");
        ConcreteObserver observer2 = new ConcreteObserver("观察者2");

        subject.addObserver(observer1);
        subject.addObserver(observer2);

        subject.setState(88);
        subject.setState(99);

        subject.removeObserver(observer1);

        subject.setState(30);
    }

}
