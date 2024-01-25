package film;

public class FilmApp {

    public static void main(String[] args) {
        FilmRepository repository = new FilmRepository();
        FilmService service = new FilmService(repository);

        service.addFilm(new Film("Film 1", "Comedy", "D1"));
        service.addFilm(new Film("Film 2", "Drama", "D2"));
        service.addFilm(new Film("Film 3", "Comedy", "D1"));

        service.printFilmsByGenre("Comedy");
        System.out.println("-----------");
        service.printFilmsByDirector("D1");
    }
}
