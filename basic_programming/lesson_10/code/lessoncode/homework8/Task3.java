package homework8;

public class Task3 {
    /*
Создайте метод, который находит элемент, который встречается чаще всего в массиве целых чисел.
Если таких элементов несколько, метод может вернуть любой из них.

     */

    /*
        {1,2,3,1,2,1,2,1,2,3,2,2,2,1,1,1,1,2,2,2,2,2,1}

        1) {9,12,2,9,12,9,12,9,12,2,12,12,12,9,9,9,9,12,12,12,12,12,9}

        2) int maxNumber = 1
        int maxCounter = 9

        после того как maxCounter >= предыдущему значению (а именно 9), то
        maxNumber = 2
        maxCounter = 12
        indexMaxNumber = 1

 надо написать метод, который принимает число и массив в качестве аргументов
 и этот метод возвращает число - количество повторений нашего переданного числа в массиве

 public int countRepeat(int[] workingArray, int findNumber){
 int counter = 0;
 for (int i = 0; i < workingArray.length; i++) {
 if (workingArray[i] == findNumber) {
 counter++;
 }
 }
 return counter;}


===============================================================


     */

    public int countRepeat(int[] workingArray, int findNumber){
        int counter = 0;
        for (int i = 0; i < workingArray.length; i++) {
            if (workingArray[i] == findNumber) {
                counter++;
            }
        }
        return counter;}
}
