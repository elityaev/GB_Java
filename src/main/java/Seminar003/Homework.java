package Seminar003;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;


public class Homework {
    public static void main(String[] args) {
        ArrayList<Integer> integers = new ArrayList<>(Arrays.asList(1, 1, 2, 3, 1, 6, 3, 5, 6, 11, 9));
        delOddNum(integers);
        System.out.println(integers);

        ArrayList<String> list = new ArrayList<>(List.of("string", "s", "5", "10", "-12", "my_value"));
        leaveOnlyString(list);
        System.out.println(list);
    }
    // Задача 1. Дан список ArrayList<Integer> целых чисел. Удалить из него нечетные числа.
//    static void delOddNum(ArrayList<Integer> source) {
//        for (int i = 0; i < source.size(); i++) {
//            if (source.get(i) % 2 != 0) {
//                source.remove(i--);
//            }
//        }
//    }
    // Второй вариант
    static void delOddNum(ArrayList<Integer> source) {
        source.removeIf(it -> it % 2 == 0);
    }


    // Задача 2. Дан список ArrayList<String>. Удалить из него все строки, которые
    // являются числами
    // Пример: ArrayList<String> list = new ArrayList<>(List.of("string", "s", "5", "10", "-12", "my_value"));
    // ["string", "s", "my_value"]


    static void leaveOnlyString(ArrayList<String> source) {
        for (int i = 0; i < source.size(); i++) {
            if (Pattern.matches("\\-?\\d+", source.get(i))) {
                source.remove(i--);
            }
        }
    }
}
