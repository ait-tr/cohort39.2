package practice;

import java.util.Comparator;

public class ComparatorSize implements Comparator<Suitcase> {
    @Override
    public int compare(Suitcase s1, Suitcase s2) {
        return s1.getSize().compareTo(s2.getSize());
    }
}
