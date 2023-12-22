package interfaces.example2;

public class Chair extends Furniture{
    Integer numberOfLegs;

    boolean isSoft;

    public Chair(String producer, String type, String catalogNumber, Integer numberOfLegs, boolean isSoft) {
        super(producer, type, catalogNumber);
        this.numberOfLegs = numberOfLegs;
        this.isSoft = isSoft;
    }
}
