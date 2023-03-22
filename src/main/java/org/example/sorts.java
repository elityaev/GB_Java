package org.example;

import java.util.Arrays;

public class sorts {

    public static void main(String[] args) {

        int[] array = {2, 11, 5, 3, 7, 9, 1};
        System.out.println(Arrays.toString(insertionSort(array)));
    }
    public static int[] insertionSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int item_to_insert = array[i];
            int j = i;
            while (j > 0 && item_to_insert < array[j - 1]) {
                array[j] = array[j - 1];
                j--;
            }
            array[j] = item_to_insert;
        }
        return array;
    }

}
