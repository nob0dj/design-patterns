package com.sh.memento.after;

import java.io.Serializable;

public class Game implements Serializable {

    CareTaker<GameSaver> careTaker = new CareTaker<>();
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

    public void save(){
        this.careTaker.push(new GameSaver(redTeamScore, blueTeamScore));
    }

    public void restore(){
        GameSaver gameSaver = this.careTaker.pop();
        if(gameSaver != null) {
            this.redTeamScore = gameSaver.getRedTeamScore();
            this.blueTeamScore = gameSaver.getBlueTeamScore();
        }
    }

    public void printSaves() {
        this.careTaker.printMementos();
    }
}
