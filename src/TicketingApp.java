import entity.Event;
import entity.Ticket;
import events.OfflineEvent;
import events.OnlineEvent;

import java.util.ArrayList;

public class TicketingApp {
    static ArrayList<Event> events = new ArrayList<>();

    public static void createEvent(){
        Event football = new OfflineEvent("Football friendly match", 20, 11, "Jakarta");
        Event webinar = new OnlineEvent("Java webinar", 10, 20);
        events.add(football);
        events.add(webinar);
        System.out.println("Events has been created");
    }

    public static void getEvent() {
        if (events.isEmpty()){
            System.out.println("Event is empty");
        } else {
            for(int i=0; i< events.size(); i++){
                System.out.printf("Event number %d", i+1);
                System.out.println();
                System.out.println(events.get(i).getName());
                System.out.println("Price : " + events.get(i).getPrice());
                System.out.println("Quota : " + events.get(i).getQuota());
                System.out.println("****************************");
            }
        }
    }

    public static void bookTicket(int eventSelected, String userName, int totalTicket){
        if (events.get(eventSelected-1).getQuota() < totalTicket ){
            System.out.println("Quota is not available");
        } else {
            Ticket newTicket = new Ticket(events.get(eventSelected-1).getName(), userName, totalTicket);
            System.out.println("Ticket has been created");
            newTicket.getDetails();
        }
    }
}
