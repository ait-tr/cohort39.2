package interfaces.example4.repositories;


import interfaces.example4.entity.Film;

public class FilmRepository implements Repository{

    Film[] filmList;

    public Film[] getFilmList() {
        return filmList;
    }

    @Override
    public Film[] createFilmCatalog(Integer totalFilmsNumber){
        if (totalFilmsNumber < 5 ){
            filmList = new Film[5];
        } else {
        filmList = new Film[totalFilmsNumber];
        }
        return filmList;
    }

    @Override
    public boolean add(Film newFilm){
        for (int i = 0; i < filmList.length; i++) {
            if (filmList[i] == null) {
                filmList[i] = newFilm;
                return true;
            }
        }
        return false;
    }

    @Override
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
