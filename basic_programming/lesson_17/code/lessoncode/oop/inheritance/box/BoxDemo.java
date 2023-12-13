package oop.inheritance.box;

public class BoxDemo {
    public static void main(String[] args) {
        Box myBox = new Box(2,3,4);
        System.out.println(myBox.getVolume());

        BoxColor myColorBox = new BoxColor(3,4,5,"Orange");
        System.out.println(myColorBox.getVolume());

        System.out.println(myColorBox.getDepth());
    }
}
