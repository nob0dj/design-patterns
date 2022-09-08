package com.sh.observer.after;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ChatServer{
    private Map<String, List<Subscriber>> subscribersMap = new HashMap<>();

    public void subscribe(String subject, Subscriber subscriber){
        if(subscribersMap.containsKey(subject)){
            subscribersMap.get(subject).add(subscriber);
        }
        else {
            List<Subscriber> subscribers = new ArrayList<>();
            subscribers.add(subscriber);
            subscribersMap.put(subject, subscribers);
        }
    }

    public void sendMessage(User user, String subject, String message){
        if(subscribersMap.containsKey(subject)){
            subscribersMap.get(subject).forEach((subscriber -> {
                subscriber.handleMessage(String.format("<%s> %s", user.getUsername(), message));
            }));
        }
    }
}
