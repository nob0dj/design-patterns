package com.sh.command.after;

/**
 * invoker
 * - Button은 Light(receiver)에 대해 모른다.
 * - receiver/command가 변경 될때 Button은 변경되지 않는다. (OCP)
 */
public class Button {

    public void press(Command command){
        command.execute();
    }

    public static void main(String[] args) {
        Button button = new Button();
        Light light = new Light();
        button.press(new LightOnCommand(light));
        button.press(new LightOffCommand(light));
    }
}
