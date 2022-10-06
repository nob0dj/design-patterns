package com.sh.proxy.after1;

/**
 * 상속을 활용한 proxy
 */
public class GameServiceProxy extends GameService {
    @Override
    public void startGame() {
        long before = System.currentTimeMillis();
        super.startGame();
        long after = System.currentTimeMillis();
        System.out.println("실행시간 : " + (after - before) + "ms");

    }
}
