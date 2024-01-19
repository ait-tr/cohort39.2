package practice.library;

public class LibraryManagement {
    public static void main(String[] args) {
        Library library = new Library();

        //add books

        library.addBook(new Book("Book1", "Author1","Genre1"));
        library.addBook(new Book("Book2", "Author2","Genre2"));
        library.addBook(new Book("Book3", "Author3","Genre3"));

        // поиск по автору

        System.out.println("Books by Author1: " + library.getBooksByAuthor("Author1"));

        // поиск по жанру

        System.out.println("Books by Genre2: " + library.getBooksByGenre("Genre2"));

        //удалить книгу и проверить обновление хранилища

        Book bookForDelete = new Book("Book1", "Author1", "Genre1");
        library.removeBook(bookForDelete);
        System.out.println("Library: " + library);
    }
}
