package com.sh.memento.after;


public class Client {

    public static void main(String[] args) {
        Game game = new Game();
        game.setRedTeamScore(100);
        game.setBlueTeamScore(90);

        GameSaver saver = game.save();

        game.setRedTeamScore(200);
        game.setBlueTeamScore(150);

        game.restore(saver);

        System.out.println("red : " + game.getRedTeamScore());
        System.out.println("blue : " + game.getBlueTeamScore());
    }
}
