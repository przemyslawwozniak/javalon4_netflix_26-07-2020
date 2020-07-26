package pl.sda.javalon4.netflix.domain;

import de.vandermeer.asciitable.AsciiTable;

import java.util.ArrayList;
import java.util.List;

public class MovieCatalogue {

    private final List<Movie> movies;

    public MovieCatalogue(List<Movie> movies) {
        this.movies = movies;
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

    //return a copy of this list so nobody can modify it throughout its reference
    public List<Movie> getMovies() {
        return new ArrayList<>(movies);
    }

}
