import service.LibraryService;

public class LibraryApp {
    public static void main(String[] args) {
        LibraryService service = new LibraryService();
        service.readFromFile();
        service.printAll();
    }
}
