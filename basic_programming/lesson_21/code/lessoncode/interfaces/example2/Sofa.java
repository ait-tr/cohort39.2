package interfaces.example2;

public class Sofa extends Furniture implements FoldOut{

    String material;

    boolean isFabric;

    public Sofa(String producer, String type, String catalogNumber, String material, boolean isFabric) {
        super(producer, type, catalogNumber);
        this.material = material;
        this.isFabric = isFabric;
    }

    @Override
    public void foldOut() {
        System.out.println("Sofa fold out");
    }
}
