package com.sh.observer.after;


import lombok.Data;

@Data
public class User implements Subscriber{
    final String username;

    @Override
    public void handleMessage(String message) {
        System.out.printf("[%s에게 도착한 message] %s%n", username, message);
    }
}
