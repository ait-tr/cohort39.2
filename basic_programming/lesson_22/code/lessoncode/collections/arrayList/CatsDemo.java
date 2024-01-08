package collections.arrayList;

public class CatsDemo {
    public static void main(String[] args) {
        Cats cats = new Cats();

        for (int i = 1; i < 6; i++) {
            Cat cat = new Cat("Cat # " + i, " breed # " + (i + 10));
            cats.addCat(cat);
        }

        System.out.println(cats.ourCats);

        Cat runAwayCat = new Cat("Cat # 3", " breed # 13");

        cats.runAwayCat(runAwayCat);
        System.out.println(cats.ourCats);

    }
}
