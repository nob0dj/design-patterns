package com.sh.command.usage;

import com.sh.command.after.Button;
import com.sh.command.after.Light;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CommandInJava {
    public static void main(String[] args) {
        Light light = new Light();
        ExecutorService executorService = Executors.newFixedThreadPool(4); // 고정개수의 쓰레드풀생성
        executorService.submit(light::turnOn);
        executorService.submit(light::turnOff);
        executorService.shutdown();
    }
}
