package interfaces.example4.repositories;

import interfaces.example4.entity.Film;

public class FilmRepositoryForDataBase implements Repository{

    String filmListDataBase;

    @Override
    public Film[] createFilmCatalog(Integer totalFilmsNumber){
    // логика создания и подключения к базе данных
        return null;
    }

    @Override
    public boolean add(Film newFilm){
        // логика добавления данных в базу данных
        return false;
    }

    @Override
    public Film findFilmByName(String filmName){
        // логика для поиска данных в базе
        return null;
    }


}
