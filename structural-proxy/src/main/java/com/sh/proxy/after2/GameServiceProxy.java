package com.sh.proxy.after2;

public class GameServiceProxy implements GameService {

    private GameService gameService;

    @Override
    public int startGame() {
        long start = System.currentTimeMillis();
        if (this.gameService == null) {
            this.gameService = new DefaultGameService();
        }

        gameService.startGame();
        long end = System.currentTimeMillis();
        System.out.println(end - start + "ms!");
        return 1;
    }
}
