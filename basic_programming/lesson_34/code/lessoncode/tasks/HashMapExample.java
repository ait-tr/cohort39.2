package tasks;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class HashMapExample {
    public static void main(String[] args) {
        Map<String, Integer> hashMap = new HashMap<>();

        hashMap.put("one",1);
        hashMap.put("two",2);
        hashMap.put("three",3);
        hashMap.put("four",4);
        hashMap.put("five",5);

        // распечатать map

        //System.out.println(hashMap);
        hashMap.forEach((key, value) -> System.out.println(key + " " + value));

        // фильтр на значение

        Map<String,Integer> filteredMap = hashMap.entrySet().stream()
                .filter(entry -> entry.getValue() > 3)
                //.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
                .collect(Collectors.toMap(entry -> entry.getKey(), entry -> entry.getValue()));


        System.out.println(filteredMap);

        // трансформация Map

        Map<String,String > transformedMap = hashMap.entrySet().stream()
                .collect(Collectors.toMap(entry -> entry.getKey(), entry -> "Value " + entry.getValue()));

        System.out.println(transformedMap);


        // посчитаем сумму всех value

        int sum = hashMap.values().stream()
                .mapToInt(Integer::intValue)
                .sum();

        int sumReduce = hashMap.values().stream()
                .reduce(0, (a,b) -> a + b);

        /* reduce ->
        у вас есть поток чисел
        1,2,3,4,5
        как работает reduce:
        он берет из потока первое значение
        у reduce есть понятие аккумулятор (собиратель / сумматор)
        это его внутренняя переменная
        она может иметь какое-то начальное значение
        к этому аккумулятору добавляется значение первого элемента
        далее берется второй элемент и прибовляется к аккумулятору

        в итоге в аккумулторе собирается сумма всех элементов
         */

        System.out.println(sumReduce);
    }
}
