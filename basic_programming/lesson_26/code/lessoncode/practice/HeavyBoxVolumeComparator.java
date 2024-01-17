package practice;

import java.util.Comparator;

public class HeavyBoxVolumeComparator implements Comparator<HeavyBox> {
    @Override
    public int compare(HeavyBox box1, HeavyBox box2) {
        return Double.compare(box1.getVolume(), box2.getVolume());
    }
}
