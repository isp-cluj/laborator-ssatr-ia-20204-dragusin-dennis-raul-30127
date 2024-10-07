package ssatr.lab1.exercise4;

import java.util.Date;

public class Ticket {

    public String eventName;
    public String name;
    public Date date;
    public int price;
    public String ticketType;
    public String phoneNumber;


    public Ticket(String eventName, String name, Date date, int price, String ticketType, String phoneNumber) {
        this.eventName = eventName;
        this.name = name;
        this.date = date;
        this.price = price;
        this.ticketType = ticketType;
        this.phoneNumber = phoneNumber;
    }
}
