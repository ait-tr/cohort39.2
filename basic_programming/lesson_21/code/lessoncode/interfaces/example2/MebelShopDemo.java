package interfaces.example2;

public class MebelShopDemo {
    public static void main(String[] args) {
        Chair chair = new Chair("Paolo Pazolini", "chair", "123-456-789", 4, true);
        Table table = new Table("Table Expert", "table", "XW123", 6, "wood", true);
        Sofa sofa = new Sofa("Ikea", "sofa", "kindergarden123", "polistirol",true);

        Furniture[] furniture = {table, chair, sofa};

        FoldOut[] foldOuts = {table, sofa};

        for (FoldOut foldOut : foldOuts) {
            foldOut.foldOut();
        }


    }
}
