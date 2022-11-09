package com.sh.mediator.before;

public class CleaningService {
    public void clean(Gym gym) {
        System.out.println("CleaningService : cleaning for " + gym);
    }

    public void getTowel(Guest guest, int numberOfTowel) {
        System.out.println("CleaningService : " + numberOfTowel + " towels to " + guest);
    }

    public void clean(Restaurant restaurant) {
        System.out.println("CleaningService : cleaning for " + restaurant);
    }
}
