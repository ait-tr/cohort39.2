public class Test5 {
    public static void test(){
        System.out.println("Нет параметров");
    }

    public static void test(String message){
        System.out.println(message);
        System.out.println("Один параметр");
    }

    public static void test(String message, int x){
        System.out.println(message);
        System.out.println(x);
        System.out.println("Два параметра");
    }

    public static void main(String[] args) {
        test();
        test("1 param");
        test("2 param", 10);

    }

}
