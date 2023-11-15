package library;

public class BookDemo {
    public static void main(String[] args) {
        Book book1 = new Book("Дюма", "Три мушкетера",350,"123-432-678",true);

        System.out.println(book1);

        Book book2 = new Book("Жуль Верн", "Дети капитана Гранта");

        System.out.println(book2);

        BookUtil util = new BookUtil();

        util.editBookCatalogNumber("987-123-765", book2);
        util.editBookPageNumber(280, book2);
        util.editBookIsInStorage(true, book2);

        System.out.println("===========");

        System.out.println(book1);
        System.out.println(book2);

        System.out.println("===========");

        Book book3 = book1;

        // НЕ РАБОТАЕТ!!! НЕ СОЗДАЕТСЯ НОВЫЙ ОБЪЕКТ А КОПИРУЕТСЯ ССЫЛКА!!!!
        System.out.println(book3);

        book3.name = "Д'Артаньян";

        System.out.println(book3);

        System.out.println("===========");

        System.out.println(book1);

        // как работает наш метод копирования

        Book book4 = util.copyBook(book2);

        System.out.println(book4);

        // другой альтернативный способ копирования

        Book book5 = new Book(book3.author + " (copy)", book3.name,book3.pages, book3.catalogNumber, book3.isInStorage);

        util.editBookCatalogNumber("ABCD_EEEE", book5);

        System.out.println(book5);




    }
}
