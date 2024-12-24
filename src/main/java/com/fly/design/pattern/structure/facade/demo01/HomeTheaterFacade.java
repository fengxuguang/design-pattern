package com.fly.design.pattern.structure.facade.demo01;

/**
 * Created by fengxuguang on 2024/12/24 14:42
 */
public class HomeTheaterFacade {

    private StereoSystem stereoSystem;
    private Projector projector;
    private LightsControl lightsControl;

    public HomeTheaterFacade() {
        stereoSystem = new StereoSystem();
        projector = new Projector();
        lightsControl = new LightsControl();
    }

    public void watchMovie() {
        System.out.println("Getting ready to watch a movie...");

        lightsControl.turnOff();
        projector.turnOn();
        stereoSystem.turnOn();
    }

    public void endMovie() {
        System.out.println("Ending the movie...");

        stereoSystem.turnOff();
        projector.turnOff();
        lightsControl.turnOn();
    }


}
