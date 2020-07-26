package pl.sda.javalon4.netflix.service;

import static org.assertj.core.api.Assertions.*;
import org.junit.jupiter.api.Test;
import pl.sda.javalon4.netflix.domain.Movie;

import java.util.List;

public class MovieCatalogueTest {

    @Test
    public void open_movie_db() {
        //given
        MovieCatalogue movieCatalogue = new MovieCatalogue();

        //when
        //initialization occurs during instance creation - read from database

        //then
        List<Movie> importedMovies = movieCatalogue.getMovies();
        assertThat(importedMovies).isNotNull();
        assertThat(importedMovies).hasSize(2);
        assertThat(importedMovies.get(0)).isNotNull();
        assertThat(importedMovies.get(0)).hasFieldOrPropertyWithValue("title", "Ogniem i Mieczem");
        //itd.

    }

}
