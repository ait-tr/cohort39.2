package practice.suitcase;

import java.util.Comparator;

public class ComparatorMaterial implements Comparator<Suitcase> {
    @Override
    public int compare(Suitcase s1, Suitcase s2) {
        return s1.getMaterial().compareTo(s2.getMaterial());
    }
}
