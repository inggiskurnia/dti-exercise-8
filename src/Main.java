import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("***** Ticketing System *****");
        System.out.println("1. Create new event");
        System.out.println("2. Show available event");
        System.out.println("3. Book ticket event");
        System.out.println("****************************");

        while(true){
            int selectedMenu = scanner.nextInt();
            switch (selectedMenu) {
                case 1 : {
                    TicketingApp.createEvent();
                    break;
                }
                case 2 : {
                    TicketingApp.getEvent();
                    break;
                }
                case 3 : {
                    System.out.println("Enter your name : ");
                    scanner.nextLine();
                    String userName = scanner.nextLine();
                    System.out.println("Select event to buy : ");
                    int eventSelected = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Enter how many ticket to buy : ");
                    int totalTicket = scanner.nextInt();
                    TicketingApp.bookTicket(eventSelected, userName, totalTicket);
                    break;
                }
            }
        }
    }
}