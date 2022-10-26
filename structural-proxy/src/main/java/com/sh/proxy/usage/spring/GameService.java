package com.sh.proxy.usage.spring;

import org.springframework.stereotype.Service;

@Service
public class GameService {

    public int startGame() {
        System.out.println("이 자리에 오신 여러분을 진심으로 환영합니다.");
        return 1;
    }

}
