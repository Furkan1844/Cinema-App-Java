import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Reservation reservation = new Reservation();

        Hall hall = new Hall(null, 0);
        Hall hall1 = new Hall("Hall 1", 100);
        Hall hall2 = new Hall("Hall 2", 100);
        Hall hall3 = new Hall("Hall 3", 100);
        Hall hall4 = new Hall("Hall 4", 100);
        Hall hall5 = new Hall("Hall 5", 100);
        Hall hall6 = new Hall("Hall 6", 100);

        List<Movie> movieList = new ArrayList<>();

        Movie movie = new Movie(null, null, 0);
        Movie movie1 = new Movie("Once Upon a Time in America", "Drama, Crime", 251);
        Movie movie2 = new Movie("Vertigo", "Mystery, Romance, Thriller", 130);
        Movie movie3 = new Movie("Mulholland Drive", "Drama, Mystery, Thriller, Film noir", 147);
        Movie movie4 = new Movie("Taxi Driver", "Drama, Crime", 114);
        Movie movie5 = new Movie("2001: A Space Odyssey", "Drama, Sci-Fi, Thriller", 141);
        Movie movie6 = new Movie("Eyes Wide Shut", "Thriller, Drama", 159);

        movieList.add(movie1);
        movieList.add(movie2);
        movieList.add(movie3);
        movieList.add(movie4);
        movieList.add(movie5);
        movieList.add(movie6);

        System.out.println(String.format("%60s", "---Movies in Theaters---\n"));
        System.out.printf("%-3s %-35s %-35s %19s%n", "", "Movie Name", "Movie Genre", "Movie Length");

        int numberOfMovie = 1;
        for (Movie movieIns : movieList) {
            System.out.println(String.format("%-3s %-35s %-35s %25s", numberOfMovie, movieIns.movieName, movieIns.movieGenre, movieIns.setMovieLength(movieIns.movieLength)));
            numberOfMovie += 1;
        }

        List<Session> sessionOfMovie1 = new ArrayList<>();
        Session session = new Session(null, null, null);
        Session movie1Session1 = new Session(movie1, hall1, "10:30");
        Session movie1Session2 = new Session(movie1, hall1, "15:45");
        Session movie1Session3 = new Session(movie1, hall1, "21:15");
        sessionOfMovie1.add(movie1Session1);
        sessionOfMovie1.add(movie1Session2);
        sessionOfMovie1.add(movie1Session3);
        List<Session> sessionOfMovie2 = new ArrayList<>();
        Session movie2Session1 = new Session(movie2, hall2, "10:30");
        Session movie2Session2 = new Session(movie2, hall2, "15:45");
        Session movie2Session3 = new Session(movie2, hall2, "21:15");
        sessionOfMovie2.add(movie2Session1);
        sessionOfMovie2.add(movie2Session2);
        sessionOfMovie2.add(movie2Session3);
        List<Session> sessionOfMovie3 = new ArrayList<>();
        Session movie3Session1 = new Session(movie3, hall3, "10:30");
        Session movie3Session2 = new Session(movie3, hall3, "15:45");
        Session movie3Session3 = new Session(movie3, hall3, "21:15");
        sessionOfMovie3.add(movie3Session1);
        sessionOfMovie3.add(movie3Session2);
        sessionOfMovie3.add(movie3Session3);
        List<Session> sessionOfMovie4 = new ArrayList<>();
        Session movie4Session1 = new Session(movie4, hall4, "10:30");
        Session movie4Session2 = new Session(movie4, hall4, "15:45");
        Session movie4Session3 = new Session(movie4, hall4, "21:15");
        sessionOfMovie4.add(movie4Session1);
        sessionOfMovie4.add(movie4Session2);
        sessionOfMovie4.add(movie4Session3);
        List<Session> sessionOfMovie5 = new ArrayList<>();
        Session movie5Session1 = new Session(movie5, hall5, "10:30");
        Session movie5Session2 = new Session(movie5, hall5, "15:45");
        Session movie5Session3 = new Session(movie5, hall5, "21:15");
        sessionOfMovie5.add(movie5Session1);
        sessionOfMovie5.add(movie5Session2);
        sessionOfMovie5.add(movie5Session3);
        List<Session> sessionOfMovie6 = new ArrayList<>();
        Session movie6Session1 = new Session(movie6, hall6, "10:30");
        Session movie6Session2 = new Session(movie6, hall6, "15:45");
        Session movie6Session3 = new Session(movie6, hall6, "21:15");
        sessionOfMovie6.add(movie6Session1);
        sessionOfMovie6.add(movie6Session2);
        sessionOfMovie6.add(movie6Session3);

        String text = String.format("%n%-3s %-35s %-35s %11s%n", "", "Movie Name", "Hall Number", "Time");

        int choiceOfMovie = movie.getMovie(movieList);

        hall.hallName = "";
        movie.movieName = "";
        List<Integer> seats = new ArrayList<>();

        try {
            switch (choiceOfMovie) {
                case 1:
                    System.out.println(String.format("%70s", "---Sessions for " + movie1.movieName + "---"));
                    System.out.println(text);
                    session.getSession(sessionOfMovie1);
                    movie.movieName = movie1.movieName;
                    hall.hallName = hall1.hallName;
                    seats = hall1.emptySeats(hall1.hallCapacity);
                    break;
                case 2:
                    System.out.println(String.format("%60s", "---Sessions for " + movie2.movieName + "---"));
                    System.out.println(text);
                    session.getSession(sessionOfMovie2);
                    movie.movieName = movie2.movieName;
                    hall.hallName = hall2.hallName;
                    seats = hall2.emptySeats(hall2.hallCapacity);
                    break;
                case 3:
                    System.out.println(String.format("%65s", "---Sessions for " + movie3.movieName + "---"));
                    System.out.println(text);
                    session.getSession(sessionOfMovie3);
                    movie.movieName = movie3.movieName;
                    hall.hallName = hall3.hallName;
                    seats = hall3.emptySeats(hall3.hallCapacity);
                    break;
                case 4:
                    System.out.println(String.format("%60s", "---Sessions for " + movie4.movieName + "---"));
                    System.out.println(text);
                    session.getSession(sessionOfMovie4);
                    movie.movieName = movie4.movieName;
                    hall.hallName = hall4.hallName;
                    seats = hall4.emptySeats(hall4.hallCapacity);
                    break;
                case 5:
                    System.out.println(String.format("%70s", "---Sessions for " + movie5.movieName + "---"));
                    System.out.println(text);
                    session.getSession(sessionOfMovie5);
                    movie.movieName = movie5.movieName;
                    hall.hallName = hall5.hallName;
                    seats = hall5.emptySeats(hall5.hallCapacity);
                    break;
                case 6:
                    System.out.println(String.format("%65s", "---Sessions for " + movie6.movieName + "---"));
                    System.out.println(text);
                    session.getSession(sessionOfMovie6);
                    movie.movieName = movie6.movieName;
                    hall.hallName = hall6.hallName;
                    seats = hall6.emptySeats(hall6.hallCapacity);
                    break;
            }
        } catch (Exception e) {
            System.out.println(e.toString());
        }

        System.out.print("Customer Name : ");
        reservation.customerName = (new Scanner(System.in)).nextLine();
        System.out.println("");

        reservation.ticketInformation(reservation.customerName, movie.movieName, hall.hallName, session.sessionTime, seats);
    }
}