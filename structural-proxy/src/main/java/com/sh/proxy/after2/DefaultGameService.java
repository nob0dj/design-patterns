package com.sh.proxy.after2;

public class DefaultGameService implements GameService {

    @Override
    public int startGame() {
        System.out.println("이 자리에 오신 여러분을 진심으로 환영합니다.");
        return 1;
    }
}
