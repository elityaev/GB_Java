package Seminar001;

import java.util.Arrays;

public class homework {

    public static void main(String[] args) {

        System.out.println("Задача №1");
        System.out.println(isSumBetween10And20(5, 15)); // true
        System.out.println(isSumBetween10And20(7, 15)); // false
        System.out.println("");

        System.out.println("Задача №2");
        System.out.println(isPositive(5)); // true
        System.out.println(isPositive(-3)); // false
        System.out.println("");

        System.out.println("Задача №3");
        printString("abcd", 5); // abcdabcdabcdabcdabcd
        System.out.println("");
        System.out.println("");

        System.out.println("Задача №4");
        System.out.println(isLeapYear(2000));
        System.out.println("");

        System.out.println("Задача №5");
        System.out.println(Arrays.toString(createArray(3, 5)));
        System.out.println("");

        System.out.println("Задача №6");
        changeNumber();
        System.out.println("");

        System.out.println("Задача №7");
        multiplyNumber();
        System.out.println("");

        int[][] array = new int[4][4]; // [[1, 0, 0, 0], [0, 1, 0, 0], [0, 0, 1, x], [0, 0, 0, 1]]
        int x = array[2][3];

        System.out.println("Задача №8");
        fillDiagonals(8);


    }

    /**
     * Задача 1. Написать метод, принимающий на вход два целых числа и проверяющий,
     * что их сумма лежит в пределах от 10 до 20 (включительно), если да – вернуть true, в противном случае – false.
     */
    private static boolean isSumBetween10And20(int a, int b) {
        if (10 <= a + b  && a + b <= 20) {
            return true;
        }
        return false;
    }

    /**
     * Задача 2. Проверить, что х положительное.
     */
    private static boolean isPositive(int x) {
        if (x > 0) {
            return true;
        }
        return false;
    }

    /**
     * Задача 3. Напечатать строку source repeat раз.
     */
    private static void printString(String source, int repeat) {
        for (int i = 0; i <= repeat; i++) {
            System.out.print(source);
        }
   }

    /**
     * Задача 4. Проверить, является ли год високосным. если да - return true.
     */
    private static boolean isLeapYear(int year) {
        if (year >= 1584 && ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))) {
            return true;
        }
        return false;
    }

    /**
     * Задача 5. Должен вернуть массив длины len, каждое значение которого равно initialValue.
     */
    private static int[] createArray(int len, int initalValue) {
        int[] array = new int[len];
        for (int i = 0; i < array.length; i++) {
            array[i] = initalValue;
        }
        return array;
    }

    /**
     * Задача 6. Задать целочисленный массив, состоящий из элементов 0 и 1.
     * Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. С помощью цикла и условия заменить 0 на 1, 1 на 0;
     */

    private static void changeNumber() {
        int[] array = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0 };
        System.out.println(Arrays.toString(array));
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 1) {
                array[i] = 0;
            } else {
                array[i] = 1;
            }
        }
        System.out.println(Arrays.toString(array));
    }

    /**
     * Задача 7. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2;
     */
    private static void multiplyNumber() {
        int[] array = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.println(Arrays.toString(array));
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 6) {
                array[i] *= 2;
            }
        }
        System.out.println(Arrays.toString(array));
    }
    /**
     * Задача 8. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
     * и с помощью цикла(-ов) заполнить его диагональные элементы единицами (можно только одну из диагоналей, если обе сложно).
     * Определить элементы одной из диагоналей можно по следующему принципу: индексы таких элементов равны, то есть [0][0], [1][1], [2][2], …, [n][n];
     * * Также заполнить элементы побочной диагонали
     */
    private static void fillDiagonals(int len) {
        int[][] array = new int[len][len];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (i == j || i + j == array.length - 1) {
                    array[i][j] = 1;
                }
            }
        }
        for (int[] item : array) {
            System.out.println(Arrays.toString(item));
        }
    }
}
