package practice;

import java.util.Comparator;

public class HeavyBoxWeigthComparator implements Comparator<HeavyBox> {
    @Override
    public int compare(HeavyBox box1, HeavyBox box2) {
        return Double.compare(box1.getWeight(), box2.getWeight());
    }
}
