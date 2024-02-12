package object;

public class Car implements Cloneable{

    private String brand;
    private int year;

    public Car(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", year=" + year +
                '}';
    }

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
