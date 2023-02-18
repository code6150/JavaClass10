package kr.code6150.ticketing;

public class Ticketing {

    private int ticket = 1;

    public int getTicket() {
        return ticket;
    }

    public synchronized boolean ticketing() {
        if(ticket > 0) {
            ticket--;
            return true;
        }
        return false;
    }

}
