package referenceTypeConversion;

public class Box extends BoxSuperSmall{

    int deep;

    public Box(int length, int width, int deep) {
        super(length, width);
        this.deep = deep;
    }

    @Override
    public String toString() {
        return "Box{" +
                "length=" + length +
                ", width=" + width +
                ", deep=" + deep +
                '}';
    }

    public int getDeep() {
        return deep;
    }
}
