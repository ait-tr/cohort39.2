package interfaces.example3;

public class CatalogApp {
    public static void main(String[] args) {
        MyCatalogService myCatalogService = new MyCatalogService();

        FilmCatalog myCatalog = myCatalogService.fillCatalog(10);

        FilmCatalogService filmCatalogService = new FilmCatalogService(myCatalog);

        //filmCatalogService.printAllCatalog();

        filmCatalogService.add(new Film("Кровавый спорт", "боевик", 1988));
        //filmCatalogService.printAllCatalog();

        System.out.println(filmCatalogService.findFilmByName("Нечто"));

    }
}
