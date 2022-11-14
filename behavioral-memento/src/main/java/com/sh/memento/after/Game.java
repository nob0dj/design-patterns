package com.sh.memento.after;

import java.io.Serializable;

public class Game implements Serializable {

    private int redTeamScore;

    private int blueTeamScore;

    public int getRedTeamScore() {
        return redTeamScore;
    }

    public void setRedTeamScore(int redTeamScore) {
        this.redTeamScore = redTeamScore;
    }

    public int getBlueTeamScore() {
        return blueTeamScore;
    }

    public void setBlueTeamScore(int blueTeamScore) {
        this.blueTeamScore = blueTeamScore;
    }

    public GameSaver save(){
        return new GameSaver(redTeamScore, blueTeamScore);
    }

    public void restore(GameSaver gameSaver){
        this.redTeamScore = gameSaver.getRedTeamScore();
        this.blueTeamScore = gameSaver.getBlueTeamScore();
    }

}
