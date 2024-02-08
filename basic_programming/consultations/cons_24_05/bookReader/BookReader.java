package bookReader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class BookReader {
    public static void main(String[] args) {
        String filePath = "basic_programming/consultations/cons_24_05/bookReader/books.txt"; // Укажите актуальный путь к файлу
        List<Book> books = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            while (reader.ready()) {
                createBook(reader, books);
            }
        } catch (Exception e) {
            System.out.println("Ошибка при чтении файла: " + e.getMessage());
        }

        // Поиск книги
        String searchTitle = "Преступление и наказание";
        Book foundBook = books.stream()
                .filter(book -> book.getBookName().equalsIgnoreCase(searchTitle))
                .findFirst()
                .orElse(null);

        if (foundBook != null) {
            System.out.println("Найденная книга: " + foundBook);
        } else {
            System.out.println("Книга с названием \"" + searchTitle + "\" не найдена.");
        }
    }

    private static void createBook(BufferedReader reader, List<Book> books) throws IOException {

        String title = extractValue(reader.readLine());
        String author = extractValue(reader.readLine());
        int yearOfPublication = Integer.parseInt(extractValue(reader.readLine()).replaceAll("[^\\d]", ""));

        books.add(new Book(title, author, yearOfPublication));
    }

    private static String extractValue(String line) {
        String value = line.substring(line.indexOf(":") + 1);
        value = value.contains(",") ? value.substring(0, value.indexOf(",")) : value;
        value = value.contains("}") ? value.replace("}", "") : value;
        return value.replace("\"", "").trim();
    }
}