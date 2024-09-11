package entity;

import feature.Details;

import java.util.UUID;

public class Ticket implements Details {
    private String eventName;
    private String userName;
    private int total;
    private UUID id;

    public Ticket(String eventName, String userName, int total){
        this.eventName = eventName;
        this.userName = userName;
        this.total = total;
        this.id = UUID.randomUUID();
    }

    public void getDetails() {
        System.out.println("Ticket for event " + eventName);
        System.out.println("Ticket belongs to " + userName);
        System.out.println("Number of ticket " + total);
        System.out.println("Ticket's ID is " + id );
    }
}
