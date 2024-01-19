package practice;

import java.util.*;

public class HeavyBoxApp {
    public static void main(String[] args) {
        HeavyBoxVolumeComparator volumeComparator = new HeavyBoxVolumeComparator();
        HeavyBoxWeigthComparator weightComparator = new HeavyBoxWeigthComparator();

        Set<HeavyBox> boxesByVolume = new TreeSet<>(volumeComparator);
        Set<HeavyBox> boxesByWeight = new TreeSet<>(weightComparator);

        Map<Owner, HeavyBox> boxesByUniqOwner = new HashMap<>();
        Map<Owner, List<HeavyBox>> boxesForOwner = new HashMap();

        Owner alice = new Owner("Alice");
        Owner richard = new Owner("Richard");
        Owner paul = new Owner("Paul");




    }
}
