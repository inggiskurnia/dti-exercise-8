import App.Sports;
import App.Ticket;
import App.User;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Init some events
        Sports idnVsAus = new Sports("Indonesia vs Australia", "Jakarta", 10, 100);
        Sports japVsIdn = new Sports("Japan vs Indonesia", "Tokyo", 50, 100);

        //Create some user
        System.out.println("Enter your name ");
        Scanner scanner = new Scanner(System.in);
        String userName = scanner.nextLine();
        System.out.println("Input balance : ");
        double userBalance = scanner.nextDouble();
        User userPlayer = new User(userName, userBalance);

        //Choose some event
        System.out.println("Choose event : ");
        System.out.println("Event number 1");
        idnVsAus.printDetails();
        System.out.println("---------------------");
        System.out.println("Event number 2");
        japVsIdn.printDetails();
        System.out.println("---------------------");
        System.out.println("Chose the event 1 or 2");
        int userSelection = scanner.nextInt();
        System.out.println("How many ticket would you buy? ");
        int userTicketRequest = scanner.nextInt();

        //Check availability
        switch (userSelection){
            case 1 : {
                if (idnVsAus.getQuota() < userTicketRequest) {
                    System.out.println("Quota is empty");
                    break;
                }
                if (userPlayer.getBalance() < idnVsAus.getPrice()){
                    System.out.println("Balance is not enough");
                    break;
                }

                idnVsAus.setQuota(-userTicketRequest);
                //Create a ticket
                Ticket userTicket = new Ticket(idnVsAus.getName(), userName, userTicketRequest);
                userTicket.printDetails();
            }
        }
    }
}