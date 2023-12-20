package referenceTypeConversion;

public class BoxApp2 {
    public static void main(String[] args) {



        // сужение типов (обратный переход) то есть движение по дереву наследования вниз, к наследникам

        // зачем это нужно?

        Box newBox = new HeavyBox(2,2,2,5);


        HeavyBox newHeavyBox = (HeavyBox) newBox;

        System.out.println(newHeavyBox.weight);

    }
}
