package generic;

import generic.genericClassWithInterface.GarbageHandlerImpl;
import generic.nonGenericClassWithInterface.MyPaperHandleMethod;

public class BoxDemo {
    public static void main(String[] args) {

        Box<Paper> boxForPaper = new Box<>();
        Box<Plastic> boxForPlastic = new Box<>();
        Box<Glass> boxForGlass = new Box<>();

        TwoCellsBox<Plastic, Glass> plasticGlassBox = new TwoCellsBox<>();


        System.out.println();

        GarbageHandlerImpl<Paper, MyPaperHandleMethod> myPaperHandleMethodGarbageHandler = new GarbageHandlerImpl<>();


    }
}
