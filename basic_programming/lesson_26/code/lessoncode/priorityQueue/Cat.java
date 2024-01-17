package priorityQueue;


public class Cat implements Comparable<Cat> {
    int id;
    String name;

    public Cat(int id, String name) {
        this.id = id;
        this.name = name;
    }


    @Override
    public int compareTo(Cat cat2) {
        String cat1Name = this.name;
        String cat2Name = cat2.name;

        int compareResult = cat1Name.compareTo(cat2Name);

        if (compareResult == 0) {
            compareResult = this.id - cat2.id;
        }

        return compareResult;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
