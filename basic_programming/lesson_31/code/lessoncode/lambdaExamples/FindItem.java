package lambdaExamples;

public class FindItem {
    // Определить количество вхождений элемента в массив

    int find(String item, String[] array, IFindItem ref){
        /*
        метод получает:
        - item - искомый элемент типа String
        - array - массив элементов типа String
        - ref - ссылка на лямбда-выражение
         */

        int count = ref.NOccurences(item, array);
        return count;
    }
}
