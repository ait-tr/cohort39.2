package referenceTypeConversion;

public class HeavyBox extends Box{

    int weight;

    public HeavyBox(int length, int width, int deep, int weight) {
        super(length, width, deep);
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "HeavyBox{" +
                "weight=" + weight +
                ", length=" + length +
                ", width=" + width +
                ", deep=" + deep +
                '}';
    }

    public int getWeight() {
        return weight;
    }
}
