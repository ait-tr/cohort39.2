package referenceTypeConversion;

public class BoxApp {
    public static void main(String[] args) {

        Box box1 = new Box(1,2,3);

        HeavyBox heavyBox = new HeavyBox(1,2,3,5);

        // приведение типов через расширение, т е переход от более конкретного типа к менее конкретному ( то есть от детей к родителям)

        Box myHeavyBox = new HeavyBox(5,5,5,10);
        //-------------

        // сужение типов (обратный переход) то есть движение по дереву наследования вниз, к наследникам

        HeavyBox heavyBox1 = (HeavyBox) box1;

        // зачем это нужно?

        Box newBox = new HeavyBox(2,2,2,5);


        HeavyBox newHeavyBox = (HeavyBox) newBox;

        System.out.println(newHeavyBox.weight);

    }
}
