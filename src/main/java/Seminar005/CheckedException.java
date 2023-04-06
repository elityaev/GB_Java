package Seminar005;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class CheckedException {
    public static void main(String[] args) {
        Path path = Path.of("file.txt");
        try {
            Files.writeString(path,"my text");  // Проверяемые исключения (checked), обязательные к проверке
        } catch (IOException e) {

        }
    }
}
