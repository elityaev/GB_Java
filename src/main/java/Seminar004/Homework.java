package Seminar004;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Homework {
    public static void main(String[] args) {
        /**
         * Реализовать консольное приложение, которое:
         *
         * 1. Принимает от пользователя строку вида text~num
         * 2. Нужно рассплитить строку по ~, сохранить text в связный список на позицию num.
         * 3. Если введено print~num, выводит строку из позиции num в связном списке.
         * 4. Если введено exit, завершаем программу
         * Пример:
         * string~4
         * num~3
         * print~3
         * num
         * print~4
         * string
         * my_value~1
         *  print~1
         *  my_value
         */
        List<String> list = new ArrayList<>();

        Scanner sc = new Scanner(System.in);
        exit: while (true)  {
            String s = sc.nextLine();
            String[] split = s.split("~");
            if (split.length < 2) {
                String value = split[0];
                switch (value) {
                    case "exit":
                        break exit;
                    default:
                        System.out.println("Введите другую команду");
                }
            } else {
                String value = split[0];
                Integer index = Integer.parseInt(split[1]);
                switch (value) {
                    case "print":
                        System.out.println(list.get(index));
                    default:
                        while (list.size() <= index) {
                            list.add(null);
                        }
                        list.set(index, value);
                }
            }
        }
    }
}
