package com.sh.mediator.after;


import java.time.LocalDateTime;

public class FrontDesk {
    private CleaningService cleaningService;
    private Restaurant restaurant;

    /**
     * cleaningService.getTowels 호출시 의존성이 없도록 Room객체가 아닌 id값을 넘긴다.
     * @param guest
     * @param numOfTowels
     */
    public void getTowels(Guest guest, int numOfTowels) {
        this.cleaningService.getTowels(guest.getRoomId(), numOfTowels);
    }

    public void bookDinner(Guest guest, LocalDateTime when) {
        this.restaurant.bookDinner(guest.getRoomId(), when);
    }

    public void setCleaningService(CleaningService cleaningService) {
        this.cleaningService = cleaningService;
    }

    public void setRestaurant(Restaurant restaurant) {
        this.restaurant = restaurant;
    }

    public void clean(Restaurant restaurant) {
        this.cleaningService.clean(restaurant.getRestaurantId());
    }
}
