import java.util.List;
import java.util.Scanner;

public class Movie {
    public String movieName;
    public String movieGenre;
    public int movieLength;

    public Movie(String movieName, String movieGenre, int movieLength) {
        this.movieName = movieName;
        this.movieGenre = movieGenre;
        this.movieLength = movieLength;
        setMovieLength(movieLength);
    }

    public String setMovieLength(int length) {
        int hours = length / 60;
        int minutes = length % 60;
        return hours + " hours " + minutes + " minutes";
    }

    public int getMovie(List<Movie> movieList) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nChoose the movie(1-" + movieList.size() + "): ");
        int choiceOfMovie = scanner.nextInt();
        while (choiceOfMovie < 1 || choiceOfMovie > movieList.size()) {
            System.out.println("Please Enter A Valid Number!");
            System.out.print("\nChoose the movie(1-" + movieList.size() + "): ");
            choiceOfMovie = scanner.nextInt();
        }
        return choiceOfMovie;
    }
}