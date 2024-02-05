import java.util.Arrays;
import java.util.List;

public class Example3FlatMap {

    public static void main(String[] args) {
        one();
    }

    public static void one(){

        int[][] arr = {{1,2,3},{17,13,15},{7,9,23}};
        System.out.println(Arrays.deepToString(arr));

        System.out.println("================");

        int[] newArr = Arrays.stream(arr)
                .flatMapToInt(Arrays::stream)
                // преобразование в одномерный поток который мы потом сбрасываем в массив
                .toArray();

        System.out.println(Arrays.toString(newArr));

        // если все сбросить в коллекцию

        List<Integer> list = Arrays.stream(arr)
                .flatMapToInt(Arrays::stream)
                .boxed() // этот метод нужен для превращения примитивных типов в объект
                .toList();

        System.out.println(list);

    }


}
