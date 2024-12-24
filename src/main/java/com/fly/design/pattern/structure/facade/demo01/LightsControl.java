package com.fly.design.pattern.structure.facade.demo01;

/**
 * 子系统: 灯光控制
 *
 * Created by fengxuguang on 2024/12/24 14:41
 */
public class LightsControl {

   public void turnOn() {
       System.out.println("Lights are turned on");
   }

   public void turnOff() {
       System.out.println("Lights are turned off");
   }

}
