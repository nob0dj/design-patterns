package com.sh.command.before;

/**
 * invoker
 */
public class Button {

    /**
     * receiver
     */
    private Light light;

    public Button(Light light) {
        this.light = light;
    }

    public void press() {
        light.off();
    }

    public static void main(String[] args) {
        Button button = new Button(new Light());
        button.press();
        button.press();
        button.press();
        button.press();
    }
}
