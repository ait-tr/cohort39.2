package generic;

import java.util.ArrayList;
import java.util.List;

public class BoxWildCard{

    List<?> example1 = new ArrayList<Paper>();

    List<? extends Garbage> example2 = new ArrayList<Plastic>();

    List<? super Garbage> example3 = new ArrayList<Garbage>();

}
