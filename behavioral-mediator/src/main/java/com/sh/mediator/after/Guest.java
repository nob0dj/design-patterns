package com.sh.mediator.after;

import java.time.LocalDateTime;

public class Guest {
    private int roomId;
    private FrontDesk frontDesk;
    public Guest(int roomId, FrontDesk frontDesk) {
       this.roomId = roomId;
       this.frontDesk = frontDesk;
    }


    public void getTowels(int numOfTowels) {
        this.frontDesk.getTowels(this, numOfTowels);
    }

    public void bookDinner() {
        this.frontDesk.bookDinner(this, LocalDateTime.now().plusHours(3));
    }

    public int getRoomId() {
        return this.roomId;
    }
}
