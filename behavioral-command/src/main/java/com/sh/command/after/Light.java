package com.sh.command.after;

/**
 * receiver
 */
public class Light {
    private boolean isOn;

    public void turnOn(){
        isOn = true;
        System.out.println("불을 켭니다.");
    }

    public void turnOff(){
        isOn = false;
        System.out.println("불을 끕니다.");
    }
}
