package com.sh.mediator.after;

public class CleaningService {
    public void getTowels(int roomId, int numOfTowels) {
        System.out.println("CleaningService : " + numOfTowels + " towels for room " + roomId);
    }

    public void clean(int restaurantId) {
        System.out.println("CleaningService : cleaning for " + restaurantId);
    }
}
