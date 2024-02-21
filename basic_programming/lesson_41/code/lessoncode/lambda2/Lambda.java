package lambda2;

public class Lambda {
    public static <T extends Number>  void findMax(T[] array, IArray<T> ref){
        T max = ref.max(array);
        System.out.println("max = " + max);
    }
}
