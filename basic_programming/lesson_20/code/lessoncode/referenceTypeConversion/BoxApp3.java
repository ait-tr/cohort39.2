package referenceTypeConversion;

public class BoxApp3 {
    public static void main(String[] args) {



        // instanceof - осуществляет проверку является ли объект экземпляром определенного класса

        BoxSuperSmall box1 = new BoxSuperSmall(1,2);
        Box box2 = new Box(1,2,3);
        HeavyBox box3 = new HeavyBox(1,2,3,4);

        if (box1 instanceof Box) {
            System.out.println("очень маленькая коробка (плоская)");
        }
        if (box2 instanceof Box) {
            System.out.println("обычная коробка ");
        }
        if (box3 instanceof Box) {
            System.out.println("тяжелая коробка");
        }


    }
}
