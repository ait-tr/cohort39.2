package generic3;

public class TestDemo {

    public static void main(String[] args) {

        Test<Integer> test1 = new Test<>(15);
        System.out.println(test1.getObj());

        Test<String> test2 = new Test<>("Java");
        System.out.println(test2.getObj());
    }

}
