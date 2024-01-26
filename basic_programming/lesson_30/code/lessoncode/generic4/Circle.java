package generic4;

public class Circle <T extends Number> implements Figure{

    private T radius;

    public Circle(T radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * radius.doubleValue() * radius.doubleValue();
    }
}
