package sort;

import java.util.Arrays;

public class ChooseArraySort {
    public static void main(String[] args) {
          /*
        {8,3,5,2,1,4,7,6} - исходный массив

        {8,|| 3,5,2,1,4,7,6} - в "правой" части ищем минимальный элемент и меняем его с первым (если это нужно)
        {1,|| 3,5,2,8,4,7,6}
        {1, 3, || 5,2,8,4,7,6}
        {1, 2, || 5,3,8,4,7,6}
        {1, 2, 5, || 3,8,4,7,6}
        {1, 2, 3, || 5,8,4,7,6}
        {1, 2, 3, 5,|| 8,4,7,6}
        {1, 2, 3, 4,|| 8,5,7,6}
        {1, 2, 3, 4, 8, || 5,7,6}
        {1, 2, 3, 4, 5, || 8,7,6}
        {1, 2, 3, 4, 5, 8, || 7,6}
        {1, 2, 3, 4, 5, 6, || 7,8}
        {1, 2, 3, 4, 5, 6, 7, || 8}

           */

        int[] arrayForSort = {8,3,5,2,1,4,7,6};
        System.out.println("Array before sort: ");
        System.out.println(Arrays.toString(arrayForSort));

        ArraySort sort = new ArraySort();
        sort.chooseSort(arrayForSort);
        System.out.println("Array after sort: ");
        System.out.println(Arrays.toString(arrayForSort));



    }
}
