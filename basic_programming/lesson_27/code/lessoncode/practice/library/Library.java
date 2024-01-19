package practice.library;

import java.util.*;

public class Library {
    private List<Book> books;
    private Set<String> authors;
    private Map<String, List<Book>> bookByGenre;

    public Library() {
        this.books = new ArrayList<>();
        this.authors = new HashSet<>();
        this.bookByGenre = new HashMap<>();
    }

    public void addBook(Book book){
        books.add(book);

        authors.add(book.getAuthor());

        List<Book> booksInGenre = bookByGenre.getOrDefault(book.getGenre(), new ArrayList<>());
        booksInGenre.add(book);
        bookByGenre.put(book.getGenre(), booksInGenre);
    }

    public List<Book> getBooksByAuthor(String author){
        List<Book> booksByAuthor = new ArrayList<>();
        for (Book book : books) {
            if (book.getAuthor().equals(author)) {
                booksByAuthor.add(book);
            }
        }
        return booksByAuthor;
    }

    public List<Book> getBooksByGenre(String genre){
        return bookByGenre.getOrDefault(genre, new ArrayList<>());
    }

    public void removeBook(Book book) {
        books.remove(book);
        // Update authors set
        Iterator<String> iterator = authors.iterator();
        while (iterator.hasNext()){
            String author = iterator.next();
            boolean hasBook = false;
            for (Book nextBook : books) {
                if (nextBook.getAuthor().equals(author)){
                    hasBook = true;
                    break;
                }
            }
            if (!hasBook) {
                iterator.remove();
            }
        }
        // обновить map booksByGenre
        List<Book> bookInGenre = bookByGenre.get(book.getGenre());
        if (bookInGenre != null) {
            bookInGenre.remove(book);
            if (bookInGenre.isEmpty()){
                bookByGenre.remove(book.getGenre());
            }
        }
    }

    @Override
    public String toString() {
        return "Library{" +
                "books=" + books +
                ", authors=" + authors +
                ", bookByGenre=" + bookByGenre +
                '}';
    }
}
