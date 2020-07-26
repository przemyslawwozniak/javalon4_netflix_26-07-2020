package pl.sda.javalon4.netflix.app;

import pl.sda.javalon4.netflix.domain.MovieGenre;
import pl.sda.javalon4.netflix.service.MovieCatalogue;

import java.util.Scanner;

public class ConsoleApp {

    private final MovieCatalogue movieCatalogue;
    private Scanner sc = new Scanner(System.in);

    public ConsoleApp(MovieCatalogue movieCatalogue) {
        this.movieCatalogue = movieCatalogue;
    }

    public void menu() {
        System.out.println("Witaj w aplikacji Netflix!\n");
        System.out.println("Co chcesz zrobić?");
        System.out.println("1: Wyświetl katalog filmów.\n2: Dodaj nowy film do zbioru.\n0: Exit\n");
        int userChoice = sc.nextInt();
        while(userChoice != 0) {
            switch(userChoice) {
                case 1:
                    movieCatalogue.show();
                    break;
                case 2:
                    insertMovie();
                    break;
            }
            System.out.println("Co chcesz teraz zrobić?");
            System.out.println("1: Wyświetl katalog filmów.\n2: Dodaj nowy film do zbioru.\n0: Exit\n");
            userChoice = sc.nextInt();
        }
    }

    private void insertMovie() {
        System.out.println("Kreator dodawania nowego filmu do katalogu. Podaj tytuł filmu i zatwierdź przyciskiem ENTER: ");
        sc.nextLine();
        String title = sc.nextLine();
        MovieGenre genre = chooseMovieGenre();
        System.out.println("Wprowadź datę premiery filmu w formacie year,month,day: ");
        sc.nextLine();
        String releaseDate = sc.nextLine();
        System.out.println("Wprowadź opis filmu: ");
        String description = sc.nextLine();

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(title);
        stringBuilder.append(";");
        stringBuilder.append(genre.name());
        stringBuilder.append(";");
        stringBuilder.append(releaseDate);
        stringBuilder.append(";");
        stringBuilder.append(description);

        String movieAsTextLine = stringBuilder.toString();
        movieCatalogue.insertMovie(MovieCatalogue.fromTextLine(movieAsTextLine));

        System.out.println("Kreator dodawania nowego filmu zakończył pracę.");
    }

    private MovieGenre chooseMovieGenre() {
        System.out.println("Wybierz gatunek filmu i zatwierdź przyciskiem ENTER: ");
        for(int i = 0; i < MovieGenre.values().length; i++)
            System.out.println(i + ": " + MovieGenre.values()[i]);
        int userChoice = sc.nextInt();
        return MovieGenre.values()[userChoice];
    }

}
