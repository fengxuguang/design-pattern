package com.fly.design.pattern.structure.facade.demo01;

/**
 * Created by fengxuguang on 2024/12/24 14:44
 */
public class Client {

    public static void main(String[] args) {
        HomeTheaterFacade homeTheaterFacade = new HomeTheaterFacade();

        // 准备观影
        homeTheaterFacade.watchMovie();

        // 结束观影
        homeTheaterFacade.endMovie();
    }

}
