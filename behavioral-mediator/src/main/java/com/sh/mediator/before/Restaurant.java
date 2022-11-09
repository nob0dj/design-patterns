package com.sh.mediator.before;

public class Restaurant {

    private CleaningService cleaningService = new CleaningService();
    public void dinner(Guest guest) {
        System.out.println("Restaurant : dinner for " + guest);
    }

    public void clean() {
        cleaningService.clean(this);
    }
}
