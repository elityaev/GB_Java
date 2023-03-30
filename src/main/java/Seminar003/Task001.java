package Seminar003;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task001 {
    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<>(Arrays.asList(1, 1, 2, 3, 1, 6, 3, 5, 6, 11, 9));
        System.out.println(integers); // [1, 1, 2, 3, 1, 6, 3, 5, 6, 11, 9]
        removeDuplicates(integers);
        System.out.println(integers); // [1, 2, 3, 6, 5, 11, 9]
    }
    private static void removeDuplicates(List<Integer> source) {
        // нужно удалить все дубликаты
        // Вариант 1.
//        long a = System.currentTimeMillis(); // кол-во милисекунд, прошедших с 1 января 1970 года
//        int i  = 0;
//        while (i < source.size()) {
//            int j = i + 1;
//            while (j <source.size()) {
//                if (source.get(i).equals(source.get(j))) {
//                    source.remove(j);
//                }
//                j++;
//            }
//            i++;
//        }
//        long b = System.currentTimeMillis(); // кол-во милисекунд, прошедших с 1 января 1970 года
//        System.out.println(b - a);
        // Вариант 2.
        List<Integer> duplicates = new ArrayList<>();
        int i = 0;
        while (i < source.size()) {
            Integer element = source.get(i);
            if (!duplicates.contains(element)) {
                duplicates.add(element);
            } else {
                source.remove(i--);
            }
            i++;
         }
    }
}
