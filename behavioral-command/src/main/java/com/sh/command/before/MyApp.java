package com.sh.command.before;

/**
 * invoker
 */
public class MyApp {

    /**
     * receiver
     */
    private Game game;

    public MyApp(Game game) {
        this.game = game;
    }

    public void press() {
        game.start();
    }

    public static void main(String[] args) {
        Button button = new Button(new Light());
        button.press();
        button.press();
        button.press();
        button.press();
    }
}
