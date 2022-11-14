package com.sh.memento.after;


public class Client {

    public static void main(String[] args) {
        Game game = new Game();
        game.setRedTeamScore(100);
        game.setBlueTeamScore(90);

        game.save();

        game.setRedTeamScore(200);
        game.setBlueTeamScore(150);

        game.save();
        game.printSaves();

        game.setRedTeamScore(300);
        game.setBlueTeamScore(200);

        game.restore();

        System.out.println("red : " + game.getRedTeamScore());
        System.out.println("blue : " + game.getBlueTeamScore());


        game.printSaves();
    }
}
