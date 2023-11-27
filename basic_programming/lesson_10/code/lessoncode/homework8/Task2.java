package homework8;

public class Task2 {
    /*
Напишите метод, который проверяет, все ли элементы в массиве уникальны.
Функция должна возвращать `true`, если все элементы уникальны, и `false`,
если найдены дубликаты.

     */
    public boolean checkAllElementsUnique(int[] workingArray){
        for (int i = 0; i < workingArray.length; i++) {
            for (int j = i + 1; j < workingArray.length; j++) {
                if (workingArray[i] == workingArray[j]) {
                    return false;
                }
            }
        }
        return true;
    }
}
