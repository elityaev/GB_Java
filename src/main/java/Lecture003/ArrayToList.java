package Lecture003;

import java.util.Arrays;
import java.util.List;

public class ArrayToList {
    public static void main(String[] args) {
        useInt();
        useStringBuilder();
    }
    static void useInt() {
        int day = 30;
        int month = 3;
        int year = 2023;
        Integer[] date = {day, month, year};
        List<Integer> dateList = Arrays.asList(date);
        System.out.println(dateList); // [30, 3, 2023]
        date[1] =  03;
        System.out.println(dateList); // [30, 3, 2023]
    }
    static void useStringBuilder() {
        StringBuilder day = new StringBuilder("30");
        StringBuilder month = new StringBuilder("3");
        StringBuilder year = new StringBuilder("2023");
        StringBuilder[] date = new StringBuilder[]{day, month, year};
        List<StringBuilder> dateList = Arrays.asList(date);
        System.out.println(dateList); // [30, 3, 2023]
        date[1] = new StringBuilder("03");
        System.out.println(dateList); // [30, 03, 2023]
    }
}
