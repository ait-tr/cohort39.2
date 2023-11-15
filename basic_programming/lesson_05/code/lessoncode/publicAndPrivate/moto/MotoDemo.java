package publicAndPrivate.moto;

public class MotoDemo {
    public static void main(String[] args) {
        Moto bmw = new Moto("silver", "R1600 GTL", "BMW");

        System.out.println(bmw);

        System.out.println("Производитель мотоцикла: " + bmw.getProducer());

        System.out.println("Модель мотоцикла: " + bmw.getModel());

        System.out.println("Цвет мотоцикла: " + bmw.getColor());

        bmw.setColor("silver-black");

        System.out.println("Цвет мотоцикла: " + bmw.getColor());

    }
}
