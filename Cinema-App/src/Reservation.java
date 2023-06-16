import java.util.List;
import java.util.Scanner;

public class Reservation {
    public String customerName;
    public int seatNumber;
    private Session session;

    public Session getSession() {
        return session;
    }

    public void setSession(Session session) {
        this.session = session;
    }

    public int ticketQuantity() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Number of Ticket: ");
        int numberOfTicket = scanner.nextInt();
        return numberOfTicket;
    }

    public void ticketInformation(String customerName, String movieName, String hallName, String sessionTime, List<Integer> seats) {
        System.out.printf("%40s%-50s%n", "", "Customer Name : \"" + customerName + "\"");
        System.out.printf("%40s%-50s%n", "", "Movie Name : \"" + movieName + "\"");
        System.out.printf("%40s%-50s%n", "", "Hall Name : \"" + hallName + "\"");
        System.out.printf("%40s%-50s%n", "", "At \"" + sessionTime + "\" o'clock");
        System.out.print(String.format("%40s%-5s", "", "Seats : "));

        for (int seat : seats) {
            System.out.printf("\"%d\", ", seat);
        }
    }
}