package interfaces.example3;

public class MyCatalogService {
    public FilmCatalog fillCatalog(Integer totalFilmNumber){

        FilmCatalog newFilmCatalog;

        if (totalFilmNumber < 5) {
            newFilmCatalog = new FilmCatalog(5);
        } else {
            newFilmCatalog = new FilmCatalog(totalFilmNumber);
        }

        newFilmCatalog.getFilms()[0] = new Film("Крестный отец (1 часть)", "криминальная драма", 1972);
        newFilmCatalog.getFilms()[1] = new Film("Нечто", "ужасы фантастика", 1982);
        newFilmCatalog.getFilms()[2] = new Film("Великолепная семерка", "вестерн", 1960);
        newFilmCatalog.getFilms()[3] = new Film("Индиана Джонс: В поисках утраченного ковчега", "приключения", 1981);
        newFilmCatalog.getFilms()[4] = new Film("Звездные войны (Эпизод IV)", "фантастика", 1977);

        return newFilmCatalog;
    }
}
