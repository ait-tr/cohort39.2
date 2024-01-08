package collections.arrayList;

import java.util.ArrayList;
import java.util.List;

public class Cats {
    ArrayList<Cat> ourCats = new ArrayList<>();

    public void addCat(Cat cat) {
        ourCats.add(cat);
    }

    public void runAwayCat(Cat cat) {
        ourCats.remove(cat);
    }

}
