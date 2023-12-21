package bookCase.entiry;

import java.util.Arrays;

public class Bookcase {
    Bookshelf[] bookShelves;

    public Bookcase(int totalNumberOfShelves, int numberOfBooks) {
        this.bookShelves = new Bookshelf[totalNumberOfShelves];
        for (int i = 0; i < totalNumberOfShelves; i++) {
            bookShelves[i] = new Bookshelf(i, new Book[numberOfBooks]);
        }
    }

    public Bookshelf[] getBookShelves() {
        return bookShelves;
    }

    @Override
    public String toString() {
        return "Bookcase{" +
                "bookshelves=" + Arrays.toString(bookShelves) +
                '}';
    }
}
