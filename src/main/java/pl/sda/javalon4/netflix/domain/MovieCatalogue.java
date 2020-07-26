package pl.sda.javalon4.netflix.domain;

import java.util.ArrayList;
import java.util.List;

public class MovieCatalogue {

    private final List<Movie> movies;

    public MovieCatalogue(List<Movie> movies) {
        this.movies = movies;
    }

    //return a copy of this list so nobody can modify it throughout its reference
    public List<Movie> getMovies() {
        return new ArrayList<>(movies);
    }

}
