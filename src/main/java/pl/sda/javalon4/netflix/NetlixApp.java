package pl.sda.javalon4.netflix;

import pl.sda.javalon4.netflix.app.ConsoleApp;
import pl.sda.javalon4.netflix.service.MovieCatalogue;

public class NetlixApp {

    public static void main(String[] args) {
        MovieCatalogue movieCatalogue = new MovieCatalogue();
        ConsoleApp consoleApp = new ConsoleApp(movieCatalogue);
        consoleApp.menu();
    }

    //pozostalosc po zad1
    /*static Supplier<List<Movie>> initialMovieListSupplier = () -> {
        List<Movie> movies = new ArrayList<>();

        Movie m1 = new Movie("Ogniem i Mieczem",
                MovieGenre.HISTORICAL,
                LocalDate.of(1999, 2, 8),
                "Adaptacja powieści Henryka Sienkiewicza. XVII wiek, na Kresach Wschodnich zbliża się wojna pomiędzy Rzeczpospolitą a Kozakami.");
        movies.add(m1);

        Movie mLeszek = new Movie("Matrix",
                MovieGenre.SCI_FI,
                LocalDate.of(1999, 3, 24),
                "Haker komputerowy Neo dowiaduje się od tajemniczych rebeliantów, że świat, w którym żyje, jest tylko obrazem przesyłanym do jego mózgu przez roboty.");
        movies.add(mLeszek);

        Movie mDawid = new Movie("Snowden",
                MovieGenre.THRILLER,
                LocalDate.of(2016, 7, 21),
                "Historia byłego pracownika CIA i NSA Edwarda Snowdena, który ujawnił prasie ściśle tajne dokumenty, doprowadzając do największego przecieku zastrzeżonych informacji w historii USA.");
        movies.add(mDawid);

        Movie mz = new Movie("Siedem",
                MovieGenre.THRILLER,
                LocalDate.of(1995, 9, 15),
                "Dwóch policjantów stara się złapać seryjnego mordercę wybierającego swoje ofiary według specjalnego klucza - siedmiu grzechów głównych.");
        movies.add(m1);

        Movie mWojtek = new Movie("American Gangster",
                MovieGenre.ACTION,
                LocalDate.of(2007, 10, 19),
                "Czarnoskóry gangster Frank Lucas buduje w Nowym Jorku ogromne narkotykowe imperium. Na jego trop wpada nieprzekupny detektyw Richie Roberts.");
        movies.add(mWojtek);

        Movie mPawel = new Movie("Niezniszczalny",
                MovieGenre.THRILLER,
                LocalDate.of(2000, 11, 14),
                "Jedyny ocalały z katastrofy pociągu, David Dunn, dzięki fanatykowi komiksów odkrywa w sobie nadludzkie możliwości.");
        movies.add(mPawel);

        Movie mDamian = new Movie("Avangers",
                MovieGenre.FANTASY,
                LocalDate.of(2012, 5, 3),
                "Grupa superbohaterów, na czele z Thorem, Iron Manem i Hulkiem, łączy siły, by obronić Ziemię przed inwazją kosmitów.");
        movies.add(mDamian);

        Movie mMichal = new Movie("BRAVEHEART-Waleczne Serce",
                MovieGenre.HISTORICAL,
                LocalDate.of(1995, 5, 18),
                "W XIII-wiecznej Szkocji William Wallace, po zabójstwie swojej żony, zwołuje rodaków do walki ze znienawidzoną angielską monarchią.");
        movies.add(mMichal);

        Movie m2 = new Movie("Transformers",
                MovieGenre.SCI_FI,
                LocalDate.of(2007,7,27),
                "Transformers – amerykański fantastycznonaukowy film akcji z 2007 roku w reżyserii Michaela Baya. W rolach głównych wystąpili Shia LaBeouf, Jon Voight i Megan Fox. Film powstał na podstawie zabawek z serii Transformers produkowanych przez Metro-Goldwyn-Mayer oraz Hasbro");
        movies.add(m2);

        Movie mAlicja = new Movie("The Godfather",
                MovieGenre.THRILLER,
                LocalDate.of(1972, 10, 20),
                "Don Vito Coreleone, head of a mafia family decides to hand over his empire to his youngest son Michael");
        movies.add(mAlicja);

        return movies;
    };*/

}
