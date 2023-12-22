package interfaces.example4;

import interfaces.example4.entity.Film;
import interfaces.example4.repositories.FilmRepository;
import interfaces.example4.repositories.FilmRepositoryForDataBase;
import interfaces.example4.repositories.Repository;
import interfaces.example4.service.MyCatalogService;

public class CatalogApp {
    public static void main(String[] args) {
        MyCatalogService myCatalogService = new MyCatalogService();

        FilmRepository filmRepository = new FilmRepository();

        Integer totalFilmNumber = 10;

        filmRepository.createFilmCatalog(totalFilmNumber);

        myCatalogService.fillCatalog(filmRepository, totalFilmNumber);

        filmRepository.printAllCatalog();

        System.out.println(filmRepository.add(new Film("Кровавый спорт", "боевик", 1988)));


        //System.out.println(filmRepository.findFilmByName("Нечто"));

    }
}
