package homework3;

public class Task4 {
    public static void main(String[] args) {
        /*
        Найдите в Интернете данные по температуре в вашем городе за прошедшую неделю.
Вычислите среднюю температуру за неделю и выведете ее на печать.

         */
        Task4Util util4 = new Task4Util();

        System.out.println(util4);

        double tempMonday = 19.9;
        double tempTuesday = 20;
        double tempWednesday = 20.1;
        double tempThursday = 19.9;
        double tempFriday = 20.1;
        double tempSaturday = 20.2;
        double tempSunday = 19.8;

        double averageTemp = (tempMonday + tempTuesday + tempWednesday + tempThursday + tempFriday + tempSaturday + tempSunday) / 7;

        System.out.println("Average temp: " + averageTemp);

        System.out.println("Average temp: " +
                util4.averageTemp(
                        tempMonday,
                        tempTuesday,
                        tempWednesday,
                        tempThursday,
                        tempFriday,
                        tempSaturday,
                        tempSunday
                ));

    }
}
