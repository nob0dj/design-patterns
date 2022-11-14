package com.sh.memento.usage;


import com.sh.memento.after.Game;

import java.io.*;
import java.util.Date;

public class MementoInJava {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        // TODO 상태값에 대해 immutable한 Memento객체인 걸 고려할때 Date도 memento패턴으로 간주할 수 있을까?
        Date date = new Date();
        long millis = date.getTime();
        Date date2 = new Date(millis);
        System.out.println(date.equals(date2)); // true

        // TODO Serializable
        Game game = new Game();
        game.setRedTeamScore(10);
        game.setBlueTeamScore(20);

        // TODO 직렬화
        try(FileOutputStream fileOut = new FileOutputStream("GameSave.hex"); // design-pattern 디렉토리 하위에 생성
            ObjectOutputStream out = new ObjectOutputStream(fileOut)){
            out.writeObject(game);
        }

        game.setBlueTeamScore(25);
        game.setRedTeamScore(15);

        // TODO 역직렬화
        try(FileInputStream fileIn = new FileInputStream("GameSave.hex");
            ObjectInputStream in = new ObjectInputStream(fileIn)){
            game = (Game) in.readObject();
            System.out.println(game.getBlueTeamScore());
            System.out.println(game.getRedTeamScore());
        }
    }
}
