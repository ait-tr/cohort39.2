package homework7;

public class LiftDemo {
    public static void main(String[] args) {
        Lift lift = new Lift();

        System.out.println("Количество подъемов на 75 этаж при подъеме на 20 этажей и спуске 7 этажей: " + lift.numberOfLifts(75,20,7));

        /*
        1 итерация - 0 + 20 - 7 = 13;
        2 итерация - 13 + 20 - 7 = 26;
        3 итерация - 26 + 20 - 7 = 39;
        4 итерация - 39 + 20 - 7 = 52;
        5 итерация - 52 + 20 - 7 = 65;
        6 итерация - 65 + 20 > 75;
        */
    }
}
