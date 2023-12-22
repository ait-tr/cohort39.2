package interfaces.example4.repositories;

import interfaces.example4.entity.Film;

public interface Repository {


    public Film[] createFilmCatalog(Integer totalFilmsNumber);
    public boolean add(Film newFilm);
    public Film findFilmByName(String filmName);

}
