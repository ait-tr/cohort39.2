package interfaces.example4;

import interfaces.example3.FilmCatalog;

public class MyCatalogService {
    public Film[] fillCatalog(FilmRepository repository){

        Film[] newFilmCatalog = repository.getFilmList();

        newFilmCatalog[0] = new Film("Крестный отец (1 часть)", "криминальная драма", 1972);
        newFilmCatalog[1] = new Film("Нечто", "ужасы фантастика", 1982);
        newFilmCatalog[2] = new Film("Великолепная семерка", "вестерн", 1960);
        newFilmCatalog[3] = new Film("Индиана Джонс: В поисках утраченного ковчега", "приключения", 1981);
        newFilmCatalog[4] = new Film("Звездные войны (Эпизод IV)", "фантастика", 1977);

        return newFilmCatalog;
    }
}
