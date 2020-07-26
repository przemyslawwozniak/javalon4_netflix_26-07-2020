package pl.sda.javalon4.netflix.service;

import de.vandermeer.asciitable.AsciiTable;
import pl.sda.javalon4.netflix.domain.Movie;
import pl.sda.javalon4.netflix.domain.MovieGenre;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MovieCatalogue {

    private List<Movie> movies = new ArrayList<>();

    public MovieCatalogue() {
        readDb();
    }

    public void show() {
        AsciiTable at = new AsciiTable();

        at.addRule();
        at.addRow("TITLE", "GENRE", "RELEASE DATE", "DESCRIPTION");

        for(Movie m : movies) {
            at.addRule();
            at.addRow(m.getTitle(), m.getGenre(), m.getReleaseDate(), m.getDesc());
        }

        at.addRule();

        System.out.println(at.render());
    }

    private void readDb() {
        ClassLoader classloader = Thread.currentThread().getContextClassLoader();

        try (InputStream resource = classloader.getResourceAsStream("db.csv")) {
            List<String> lines =
                    new BufferedReader(new InputStreamReader(resource,
                            StandardCharsets.UTF_8)).lines().collect(Collectors.toList());

            for(String line : lines){
                movies.add(fromTextLine(line));
            }

            System.out.println("MovieCatalogue: Movies read from DB finished.");
        }
        catch(IOException ex) {
            System.err.println("MovieCatalogue: Cannot open db.csv file: " + ex);
        }
    }

    public static Movie fromTextLine(String line) {
        String[] splittedByComma = line.split(";");

        String mTitle = splittedByComma[0];

        String genre = splittedByComma[1];
        MovieGenre mGenre = MovieGenre.valueOf(genre);

        String releaseDate = splittedByComma[2];
        LocalDate mReleaseDate = fromText(releaseDate);

        String mDescription = splittedByComma[3];

        return new Movie(mTitle, mGenre, mReleaseDate, mDescription);
    }

    //1999,2,8
    private static LocalDate fromText(String line) {
        String[] splittedByComma = line.split(",");
        int[] convertedToInt = new int[3];
        for(int i = 0; i < splittedByComma.length; i++) {
            convertedToInt[i] = Integer.parseInt(splittedByComma[i]);
        }
        return LocalDate.of(convertedToInt[0], convertedToInt[1], convertedToInt[2]);
    }

    public void insertMovie(Movie movie) {
        movies.add(movie);
        System.out.println("MovieCatalogue: Dodano nowy film to bazy danych: " + movie.getTitle());
    }

    //return a copy of this list so nobody can modify it throughout its reference
    public List<Movie> getMovies() {
        return new ArrayList<>(movies);
    }

}
