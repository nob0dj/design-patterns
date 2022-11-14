package com.sh.memento.after;

/**
 * Memento
 * - immutable해야 한다.
 * - 생성자를 통한 필드값대입 + getter 제공
 */
public final class GameSaver {
    private final int redTeamScore;
    private final int blueTeamScore;

    public GameSaver(int redTeamScore, int blueTeamScore) {
        this.redTeamScore = redTeamScore;
        this.blueTeamScore = blueTeamScore;
    }

    public int getRedTeamScore() {
        return redTeamScore;
    }

    public int getBlueTeamScore() {
        return blueTeamScore;
    }

    @Override
    public String toString() {
        return "GameSaver{" +
                "redTeamScore=" + redTeamScore +
                ", blueTeamScore=" + blueTeamScore +
                '}';
    }
}
