package interfaces.example2;

public class Table extends Furniture implements FoldOut{

    Integer numberOfLegs;

    String material;

    boolean isRound;

    public Table(String producer, String type, String catalogNumber, Integer numberOfLegs, String material, boolean isRound) {
        super(producer, type, catalogNumber);
        this.numberOfLegs = numberOfLegs;
        this.material = material;
        this.isRound = isRound;
    }

    @Override
    public void foldOut() {
        System.out.println("12334");
    }
}
