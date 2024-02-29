package date;

import java.time.LocalDate;

public class Order {
    private final LocalDate date;

    public Order(LocalDate date) {
        this.date = date;
    }

    public LocalDate getDate() {
        return date;
    }
}
