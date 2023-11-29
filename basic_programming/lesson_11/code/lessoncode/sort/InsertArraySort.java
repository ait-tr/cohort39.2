package sort;

import java.util.Arrays;

public class InsertArraySort {
    public static void main(String[] args) {

           /*
        {8,3,5,2,1,4,7,6} - исходный массив

        {8,|| 3,5,2,1,4,7,6} - в "правой" части мы делаем сортировку
        {8,3,|| 5,2,1,4,7,6}
        {3,8,|| 5,2,1,4,7,6}
        {3,8,5, || 2,1,4,7,6}
        {3,5,8, || 2,1,4,7,6}
        {3,5,8,2, || 1,4,7,6}
        {2,3,5,8, || 1,4,7,6}
        {2,3,5,8, 1, || 4,7,6}
        {1, 2,3,5,8, || 4,7,6}
        {1, 2,3,5,8,4, || 7,6}
        {1, 2,3,4,5,8, || 7,6}
        {1, 2,3,4,5,8,7, || 6}
        {1, 2,3,4,5, 7,8 || 6}
        {1, 2,3,4,5, 7, 8, 6}
        {1, 2,3,4,5, 6, 7, 8,}
           */

        int[] arrayForSort = {8,3,5,2,1,4,7,6};
        System.out.println("Array before sort: ");
        System.out.println(Arrays.toString(arrayForSort));

        ArraySort sort = new ArraySort();
        sort.insertSort(arrayForSort);
        System.out.println("Array after sort: ");
        System.out.println(Arrays.toString(arrayForSort));


    }
}
