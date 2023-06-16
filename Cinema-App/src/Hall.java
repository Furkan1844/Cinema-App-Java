import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Hall extends Reservation {
    public String hallName;
    public int hallCapacity;
    private Reservation reservation = new Reservation();

    public Hall(String hallName, int hallCapacity) {
        this.hallName = hallName;
        this.hallCapacity = hallCapacity;
    }

    public List<Integer> assignRandomSeat(int seatQuantity) {
        Random random = new Random();
        List<Integer> seats = new ArrayList<>();

        int randomNumber = random.nextInt(31) + 20;
        for (int i = 0; i < randomNumber; i++) {
            int seat = random.nextInt(seatQuantity) + 1;

            if (seats.contains(seat)) {
                i--;
                continue;
            }
            seats.add(seat);
        }
        return seats;
    }

    public List<Integer> emptySeats(int hallCapacity) {
        System.out.println("---Empty Seats---\n");

        List<String> letters = List.of("|A|", "|B|", "|C|", "|D|", "|E|", "|F|", "|G|", "|H|", "|I|", "|J|");
        List<Integer> numbers = assignRandomSeat(hallCapacity);

        int seat = 1;

        for (String letter : letters) {
            System.out.print(String.format("%-10s %-15s ", "", letter));
            for (int i = 1; i <= 10; i++) {
                if (numbers.contains(seat)) {
                    System.out.print(String.format("%-5s", "|X|"));
                } else {
                    System.out.print(String.format("%-5s", seat));
                }
                seat++;
            }
            System.out.println("\n");
        }

        int ticketQuantity = reservation.ticketQuantity();

        System.out.println("\nChoose the seats : ");

        List<Integer> listOfSeats = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        for (int i = 1; i <= ticketQuantity; i++) {
            System.out.print("For Seat " + i + " - ");
            int numberOfSeat = scanner.nextInt();
            listOfSeats.add(numberOfSeat);
        }
        System.out.println();
        return listOfSeats;
    }
}