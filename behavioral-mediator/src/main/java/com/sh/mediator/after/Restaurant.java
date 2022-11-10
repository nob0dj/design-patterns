package com.sh.mediator.after;

import java.time.LocalDateTime;

public class Restaurant {
    private final int restaurantId;
    private final FrontDesk frontDesk;

    public Restaurant(int restaurantId, FrontDesk frontDesk) {
        this.restaurantId = restaurantId;
        this.frontDesk = frontDesk;
    }

    public void bookDinner(int roomId, LocalDateTime when) {
        System.out.println("Restaurant : booking dinner for " + roomId + " at " + when);
    }

    public void clean() {
        this.frontDesk.clean(this);
    }

    public int getRestaurantId() {
        return this.restaurantId;
    }
}
