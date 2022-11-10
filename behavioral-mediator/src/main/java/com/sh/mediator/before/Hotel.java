package com.sh.mediator.before;

public class Hotel {

    public static void main(String[] args) {
        Guest guest = new Guest();
        guest.getTowel(3);
        guest.dinner();

        Restaurant restaurant = new Restaurant();
        restaurant.clean();
    }
}
