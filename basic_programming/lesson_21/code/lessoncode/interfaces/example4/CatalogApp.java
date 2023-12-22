package interfaces.example4;

import interfaces.example3.FilmCatalog;

public class CatalogApp {
    public static void main(String[] args) {
        MyCatalogService myCatalogService = new MyCatalogService();
        FilmRepository filmRepository = new FilmRepository();
        filmRepository.createFilmCatalog(10);



        myCatalogService.fillCatalog(filmRepository);



        //filmCatalogService.printAllCatalog();

        filmRepository.add(new Film("Кровавый спорт", "боевик", 1988));
        filmRepository.printAllCatalog();

        //System.out.println(filmRepository.findFilmByName("Нечто"));

    }
}
