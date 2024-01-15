package practice;

import java.util.Comparator;

public class ComparatorColor implements Comparator<Suitcase> {
    @Override
    public int compare(Suitcase s1, Suitcase s2) {
        return s1.getColor().compareTo(s2.getColor());
    }
}
