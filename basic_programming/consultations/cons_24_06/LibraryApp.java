import service.LibraryService;

public class LibraryApp {
    public static void main(String[] args) {
        LibraryService service = new LibraryService();
        service.readFromFile("basic_programming/consultations/cons_24_06/resources/books.txt");
        service.printAll();
    }
}
