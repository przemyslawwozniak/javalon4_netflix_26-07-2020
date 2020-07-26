package pl.sda.javalon4.netflix;

import pl.sda.javalon4.netflix.domain.Movie;
import pl.sda.javalon4.netflix.domain.MovieCatalogue;
import pl.sda.javalon4.netflix.domain.MovieGenre;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

public class NetlixApp {

    public static void main(String[] args) {
        MovieCatalogue movieCatalogue = new MovieCatalogue(initialMovieListSupplier.get());
        System.out.println(movieCatalogue.getMovies());
    }

    static Supplier<List<Movie>> initialMovieListSupplier = () -> {
        List<Movie> movies = new ArrayList<>();

        Movie m1 = new Movie("Ogniem i Mieczem",
                MovieGenre.HISTORICAL,
                LocalDate.of(8, 2, 1999),
                "Adaptacja powieści Henryka Sienkiewicza. XVII wiek, na Kresach Wschodnich zbliża się wojna pomiędzy Rzeczpospolitą a Kozakami.");
        movies.add(m1);

        //kolejne filmy

        return movies;
    };

}
