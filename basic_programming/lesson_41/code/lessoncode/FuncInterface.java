import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class FuncInterface {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();

        strings.add("22");
        strings.add("7777777");
        strings.add("88888888");
        strings.add("1");
        strings.add("55555");
        strings.add("4444");
        strings.add("999999999");
        strings.add("666666");
        strings.add("333");

        System.out.println(strings);
        Collections.sort(strings);

        System.out.println(strings);




        Collections.sort(strings,new StringComparator());
        System.out.println(strings);


        Comparator<String> comp = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        };

        Comparator<String> comp1 = (String o1, String o2) -> {
                return o1.compareTo(o2);
        };

        Comparator<String> comp2 = (o1, o2) -> o1.compareTo(o2);

        /**
          1. Создай анонимный класс, который будет имплементировать интерфейс
         Comparator
         2. Поскольку интерфейс Comparator является функциональным (то есть в нем
         объявлен только ОДИН метод), то код который мы напишем далее относится
         именно к этому методу
         3. Используй в качестве типов данных для метода - то что было указано
         в момент объявления Comparator<String>, то есть String
         4. Дополни код фигурными скобками и return
         */




        Collections.sort(strings,comp);


        System.out.println(strings);
    }
}
