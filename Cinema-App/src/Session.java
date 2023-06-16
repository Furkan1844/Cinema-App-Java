import java.util.List;
import java.util.Scanner;

public class Session {
    public String sessionTime;
    public Hall hall;
    public Movie movie;

    public Session(Movie movie, Hall hall, String sessionTime) {
        this.sessionTime = sessionTime;
        this.hall = hall;
        this.movie = movie;
    }

    public int getSession(List<Session> sessionOfMovie) {
        int numberOfSession = 1;

        for (Session session : sessionOfMovie) {
            System.out.println(String.format("%-3s %-35s %-35s %12s", numberOfSession, session.movie.movieName, session.hall.hallName, session.sessionTime));
            numberOfSession++;
        }

        System.out.print("\nChoose the session(1-" + sessionOfMovie.size() + ") : ");

        Scanner scanner = new Scanner(System.in);
        int choiceOfSession = scanner.nextInt();
        System.out.println();

        while (choiceOfSession > sessionOfMovie.size() || choiceOfSession < 1) {
            System.out.println("Please Enter A Valid Number!\n");
            return getSession(sessionOfMovie);
        }
        return choiceOfSession;
    }
}