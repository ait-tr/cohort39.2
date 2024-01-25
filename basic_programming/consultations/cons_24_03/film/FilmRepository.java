package film;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class FilmRepository {
    private final Set<Film> films;

    public FilmRepository() {
        this.films = new HashSet<>();
    }

    public void addFilm(Film film) {
        films.add(film);
    }

    public Set<Film> getFilmsByGenre(String genre) {
        Set<Film> filteredFilms = new HashSet<>();
        for (Film film : films) {
            if (film.getGenre().equalsIgnoreCase(genre)) {
                filteredFilms.add(film);
            }
        }
        return filteredFilms;
    }

    public Set<Film> getFilmsByDirector(String director) {
        Set<Film> filteredFilms = new HashSet<>();
        for (Film film : films) {
            if (film.getDirector().equalsIgnoreCase(director)) {
                filteredFilms.add(film);
            }
        }
        return filteredFilms;
    }

}
