package interfaces.example3;

public class FilmCatalogService {

    FilmCatalog catalog;

    Film[] filmList;

    public FilmCatalogService(FilmCatalog catalog) {
        this.catalog = catalog;
        this.filmList = catalog.getFilms();
    }

    public boolean add(Film newFilm){
        for (int i = 0; i < filmList.length; i++) {
            if (filmList[i] == null) {
                filmList[i] = newFilm;
                return true;
            }
        }
        return false;
    }

    public Film findFilmByName(String filmName){
        for (int i = 0; i < filmList.length; i++) {
            if (filmList[i].getFilmName().equals(filmName)) {
                return filmList[i];
            }
        }
        return null;
    }

    public void printAllCatalog(){
        for (Film film : filmList) {
            if (film != null) {
                System.out.println();
                System.out.print("Название фильма: " + film.getFilmName() + ", жанр: " + film.getGenre() + ", год выхода: " + film.getYear());
            }
        }
    }

}
