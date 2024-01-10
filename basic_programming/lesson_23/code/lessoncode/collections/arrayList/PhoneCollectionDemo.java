package collections.arrayList;

import java.util.ArrayList;

public class PhoneCollectionDemo {
    public static void main(String[] args) {
        ArrayList<Phone> phones = new ArrayList<>();

        System.out.println(phones);
        System.out.println(phones.size());

        phones.add(new Phone(1,"iPhone13 Max Pro", "Apple", 1250.00));

        System.out.println(phones);
        System.out.println(phones.size());

        phones.add(new Phone(2,"iPhone14 Max Pro", "Apple", 1350.00));
        phones.add(new Phone(3,"iPhone15 Max Pro", "Apple", 1500.00));
        phones.add(new Phone(4,"Galaxy", "Samsung", 1100.00));


        System.out.println(phones);
        System.out.println(phones.size());

        System.out.println(phones.get(2));

        phones.remove(2);
        System.out.println(phones.get(2));
        System.out.println(phones);

    }
}
