package date;

import java.time.LocalDateTime;
import java.time.ZoneId;

public class Date8Example {
    public static void main(String[] args) {
        ZoneId rigaZone = ZoneId.of("Europe/Riga");


        // Получение текущей временной зоны в Латвии
        ZoneId asiaZone = ZoneId.of("Asia/Shanghai");

        // Получение текущего времени в Латвии
        LocalDateTime rigaTime = LocalDateTime.now(rigaZone);

        // Преобразование времени из Латвии в Шанхай
        LocalDateTime asisTime = rigaTime.atZone(rigaZone)
                .withZoneSameInstant(asiaZone)
                .toLocalDateTime();

        // Вывод текущего времени в Asia
        System.out.println("Текущее время в Asia: " + asisTime);



    }
}
