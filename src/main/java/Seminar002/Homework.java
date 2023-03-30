package Seminar002;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Homework {
    public static void main(String[] args) throws IOException {
        System.out.println(buildString(4, 'a', 'b')); // "ababab"
        writeText("TEXT ", 100);
    }

    /**
     * Задача 1. Дано четное число N (>0) и символы с1 и с2.
     * Написать метод, который вернет строку длины N, которая состоит из чередующихся символов
     * с1 и с2, начиная с с1.
     * (6, 'a', 'b') -> "ababab"
    */
    static String buildString(int n, char c1, char c2) throws IOException {
        if ( n % 2 == 0) {
            String result = "";
            String substring = "" + c1 + c2;
            for (int i = 0; i < n / 2; i++) {
                result += substring;
            }
            Path of = Path.of(String.format("file_%d_%s.txt", n / 2, substring));
            if (Files.exists(of)) {
                return "Результатыми работы функции с такими аргументами уже записаны в файл";
            } else  {
                Files.createFile(of);
                Files.writeString(of, result);
                return result;
            }
        } else {
            return "n - нечетное число ";
        }
    }

    /**
     * Задача 2. Создать файл с названием file.txt. Если файл уже есть, то создавать
     * не надо Записать в него Слово "TEXT" 100 раз
     */

    static void writeText(String text, int n) throws IOException {
        Path of = Path.of("file.txt");
        if (!Files.exists(of)) {
            Files.createFile(of);
        }
        BufferedOutputStream os = new BufferedOutputStream(new FileOutputStream(of.toFile()));
        for (int i = 0; i < n; i++) {
            os.write(text.getBytes());
        }
        os.flush();
    }
}
