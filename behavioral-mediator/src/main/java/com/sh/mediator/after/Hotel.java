package com.sh.mediator.after;

public class Hotel {

    public static void main(String[] args) {
        FrontDesk frontDesk = new FrontDesk();
        CleaningService cleaningService = new CleaningService();
        Restaurant restaurant = new Restaurant(1000, frontDesk);
        frontDesk.setCleaningService(cleaningService);
        frontDesk.setRestaurant(restaurant);


        int roomId = 301;
        Guest guest = new Guest(roomId, frontDesk);
        guest.getTowels(3);
        guest.bookDinner();

        restaurant.clean();
    }
}
