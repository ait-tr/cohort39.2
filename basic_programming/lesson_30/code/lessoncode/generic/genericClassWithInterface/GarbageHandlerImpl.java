package generic.genericClassWithInterface;

import generic.Garbage;
import generic.GarbageHandler;
import generic.HandleMethod;

public class GarbageHandlerImpl <T extends Garbage, S extends HandleMethod> implements GarbageHandler<T,S> {
    @Override
    public void handle(T what, S how) {

    }

    @Override
    public <E> void transfer(E dangerousWaste) {

    }
}
