package generic4;

public class FigureDemo {
    public static void main(String[] args) {
        // пример на Rectangle с Integer

        Rectangle<Integer> rInt = new Rectangle<>(10,20,30,50);

        double areaRect = rInt.area();
        System.out.println("Rectangle area = " + areaRect);

        // пример на Rectangle с Double

        Rectangle<Double> rDouble = new Rectangle<>(1.5,5.5,3.5,5.5);

        areaRect = rDouble.area();
        System.out.println("Rectangle area = " + areaRect);

        // пример на Circle с Float

        Circle<Float> cFloat = new Circle<>(10.5f);

        double areaCircle = cFloat.area();
        System.out.println("Circle area = " + areaCircle);

    }
}
