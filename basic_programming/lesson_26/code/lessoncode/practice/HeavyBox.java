package practice;

import java.util.Objects;

public class HeavyBox extends Box{

    private double weight;

    public HeavyBox(double length, double width, double height, double weight) {
        super(length, width, height);
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HeavyBox heavyBox = (HeavyBox) o;
        return Double.compare(weight, heavyBox.weight) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(weight);
    }

    @Override
    public String toString() {
        return "HeavyBox{" +
                "length =" + getLength() +
                ", width =" + getWidth() +
                ", height =" + getHeight() +
                ", weight =" + weight +
                ", Volume =" + getVolume() +
                '}';
    }
}
