package referenceTypeConversion;

public class BoxSuperSmall {

    int length;
    int width;

    public BoxSuperSmall(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }

    @Override
    public String toString() {
        return "BoxSuperSmall{" +
                "length=" + length +
                ", width=" + width +
                '}';
    }
}
