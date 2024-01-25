package film;

import java.util.Set;

public class FilmService {
    private FilmRepository repository;

    public FilmService(FilmRepository repository) {
        this.repository = repository;
    }

    public void addFilm(Film film) {
        repository.addFilm(film);
    }

    public void printFilmsByGenre(String genre) {
        Set<Film> films = repository.getFilmsByGenre(genre);
        if (films.isEmpty()) {
            System.out.println("Фильмы жанра " + genre + " не найдены.");
        } else {
            films.forEach(System.out::println);
        }
    }

    public void printFilmsByDirector(String director) {
        Set<Film> films = repository.getFilmsByDirector(director);
        if (films.isEmpty()) {
            System.out.println("Фильмы режиссера " + director + " не найдены.");
        } else {
            films.forEach(System.out::println);
        }
    }
}
