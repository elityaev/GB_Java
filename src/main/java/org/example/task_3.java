package org.example;

public class task_3 {
    /**
     * Напишите метод, который находит самую длинную строку общего префикса среди массива строк.
     * Если общего префикса нет, вернуть пустую строку "".
     */
    public static void main(String[] args) {
        String[] array = {"abc", "abcdf", "abcqqqq", "abeee"};

        String commonPrefix = findCommonPrefix(array);

        System.out.println(commonPrefix);
    }
    static String findCommonPrefix(String[] array) {
        String shortString = array[0];
        for (int i = 1; i < array.length; i++) {
            if (shortString.length() > array[i].length()) {
                shortString = array[i];
            }
        }

        String result = "";
        first: for (int index = 0; index < shortString.length(); index++) {
            char firstIndexChar = shortString.charAt(index);
            for (int i = 1; i < array.length; i++) {
                char secondStringChar = array[i].charAt(index);

                if (firstIndexChar != secondStringChar) {
                    break first;
                }
            }
            result += firstIndexChar;
        }
        return result;
    }
}
