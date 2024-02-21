package stream2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class PetsSelector {
    private static List<Owner> owners;

    public static void initData(){
        Owner owner1 = new Owner("Oleg");
        owner1.getPets().addAll(List.of(
                new Cat("Baron", Color.GREY, 3),
                new Cat("Sultan", Color.BLACK, 4),
                new Dog("Elza", Color.WHITE, 1)
                ));

        Owner owner2 = new Owner("Roman");
        owner2.getPets().addAll(List.of(
                new Cat("Рыжик", Color.GREY, 7),
                new Cat("Барсик", Color.GREY, 4),
                new Parrot("Admiral", Color.GREEN, 11)
        ));

        Owner owner3 = new Owner("Nataly");
        owner3.getPets().addAll(List.of(
                new Dog("Арнольд", Color.BLACK, 2),
                new Pig("Piggy", Color.GREY, 5)
        ));

        Owner owner4 = new Owner("Pavel");
        owner4.getPets().addAll(List.of(
                new Mouse("Jerry", Color.GREY, 3)

        ));

        Owner owner5 = new Owner("Anton");
        owner5.getPets().addAll(List.of(
                new Cat("Fisher", Color.BLACK, 3),
                new Cat("Zorro", Color.WHITE, 4),
                new Cat("Margo", Color.GREY, 3),
                new Cat("Bamby", Color.GREY, 4)
        ));

        owners = List.of(owner1,owner2,owner3,owner4,owner5);

    }

//    public static void main(String[] args) {
//
//        initData();
//
//        List<String> names = new ArrayList<>();
//        List<Cat> findCats = new ArrayList<>();
//
//        for (Owner owner : owners){
//            for (Animal pet : owner.getPets()) {
//                if (Cat.class.equals(pet.getClass()) && Color.GREY == pet.getColor()) {
//                    findCats.add((Cat) pet);
//                }
//            }
//        }
//
//        Collections.sort(findCats, new Comparator<Cat>() {
//            @Override
//            public int compare(Cat cat1, Cat cat2) {
//                return cat2.getAge() - cat1.getAge();
//            }
//        });
//
//        for (Cat cat : findCats) {
//            names.add(cat.getName());
//        }
//
//        names.forEach(System.out::println);
//
//    }

    public static void main(String[] args) {
        initData();

        List<String> names = owners.stream()
                .flatMap(owner -> owner.getPets().stream())
                .filter(pet -> Cat.class.equals(pet.getClass()))
                .filter(cat -> Color.GREY == cat.getColor())
                .sorted((cat1, cat2) -> cat2.getAge() - cat1.getAge())
                .map(Animal::getName)
                .toList();

        /*
        - переход от Stream<Owner> к Stream<Pet>
        - оставляем в потоке только котов
        - оставляем в потоке котов только серых
        - сортируем по убыванию возраста
        - берем их имена
        - результат скидываем в список
         */

        names.forEach(System.out::println);


    }


}
