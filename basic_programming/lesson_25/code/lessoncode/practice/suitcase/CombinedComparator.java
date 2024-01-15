package practice.suitcase;

import java.util.Comparator;

public class CombinedComparator {
    Comparator<Suitcase> bySize = new ComparatorSize();
    Comparator<Suitcase> byMaterial = new ComparatorMaterial();
    Comparator<Suitcase> byColor = new ComparatorColor();

    Comparator<Suitcase> combined = bySize.thenComparing(byMaterial.thenComparing(byColor));

    public Comparator<Suitcase> getCombined() {
        return combined;
    }
}
