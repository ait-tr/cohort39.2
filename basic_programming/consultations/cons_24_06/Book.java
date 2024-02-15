public class Book extends LibraryItem implements Describable{

    private String geanre;

    public Book(String title, String author, int year, String geanre) {
        super(title, author, year);
        this.geanre = geanre;
    }

    public String getGeanre() {
        return geanre;
    }

    @Override
    public String getDescribe() {
        return "Book with geanre" + geanre;
    }
}
