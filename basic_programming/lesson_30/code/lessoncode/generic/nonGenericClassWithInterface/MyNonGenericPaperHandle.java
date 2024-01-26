package generic.nonGenericClassWithInterface;

import generic.GarbageHandler;
import generic.Paper;

public class MyNonGenericPaperHandle implements GarbageHandler<Paper, MyPaperHandleMethod> {
    @Override
    public void handle(Paper what, MyPaperHandleMethod how) {
        // здесь что-то делается с бумажным мусором способ MyPaperHandleMethod
    }
}
