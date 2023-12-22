package interfaces.example3;

public class FilmCatalog {

    private Film[] films;

    public FilmCatalog(Integer totalFilmsNumber) {
        this.films = new Film[totalFilmsNumber];
    }

    public Film[] getFilms() {
        return films;
    }
}
