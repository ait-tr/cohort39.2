package date;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class OrderSort {
    public static void main(String[] args) {
        List<Order> orders = Arrays.asList(
                new Order(LocalDate.of(2024, Month.JANUARY,15)),
                new Order(LocalDate.of(2024, Month.JANUARY,25)),
                new Order(LocalDate.of(2024, Month.FEBRUARY,7)),
                new Order(LocalDate.of(2024, Month.FEBRUARY,12)),
                new Order(LocalDate.of(2024, Month.FEBRUARY,21)),
                new Order(LocalDate.of(2024, Month.MARCH,15))
                );

        Map<Month, List<Order>> ordersByMonth = orders.stream()
                .collect(Collectors.groupingBy(order -> order.getDate().getMonth()));

        ordersByMonth.forEach((month, ordersInMonth) -> {
            System.out.println("Месяц : " + month);
            ordersInMonth.forEach(order -> System.out.println("дата заказа: " + order.getDate()));
        });
    }
}
