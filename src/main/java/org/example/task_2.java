package org.example;

import java.util.Arrays;

public class task_2 {
    /**
    * Дан массив nums = [3,2,2,3] и число val = 3. Если в массиве есть числа,
    * равные заданному, нужно перенести эти элементы в конец массива. Таким образом,
    * первые несколько (или все) элементов массива должны быть отличны от заданного, а остальные - равны ему.
    */
    public static void main (String[] args) {
        int[] nums = {3, 2, 2, 3, 1, 5, 5, 3, 3};
        int val = 3;

        swap(nums, val);

        System.out.println(Arrays.toString(nums));
    }
    static void swap(int[] array, int val) {
        int size = array.length;
        int shift = 1;
        for (int i = 0; i < size - shift ; i++) {
            while (array[size - shift] == val) {
                shift++;
            }

            if (array[i] == val) {
                array[i] = array[size - shift];
                array[size - shift] = val;
                shift++;
            }
        }
    }
}


// Python
//nums = [3, 3, 2, 3, 1, 5, 5, 6, 0]
//val = 3
//last = 0
//    for i in range(len(nums) - 1):
//        if nums[i] == val and nums[i + 1] != val:
//            nums[last] = nums[i + 1]
//            nums[i + 1] = val
//            last += 1
//e       lif nums[i] != val:
//            last += 1
//print(nums)