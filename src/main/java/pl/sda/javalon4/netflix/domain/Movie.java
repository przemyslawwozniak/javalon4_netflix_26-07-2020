package pl.sda.javalon4.netflix.domain;

import java.time.LocalDate;

public class Movie {

    private final String title, desc;
    private final MovieGenre genre;
    private final LocalDate releaseDate;

    public Movie(String title, MovieGenre genre, LocalDate releaseDate, String desc) {
        this.title = title;
        this.desc = desc;
        this.genre = genre;
        this.releaseDate = releaseDate;
    }

    public String getTitle() {
        return title;
    }

    public String getDesc() {
        return desc;
    }

    public MovieGenre getGenre() {
        return genre;
    }

    public LocalDate getReleaseDate() {
        return releaseDate;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "title='" + title + '\'' +
                ", desc='" + desc + '\'' +
                ", genre=" + genre +
                ", releaseDate=" + releaseDate +
                '}';
    }
}
