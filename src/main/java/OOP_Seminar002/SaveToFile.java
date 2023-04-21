package OOP_Seminar002;

import java.io.FileWriter;
import java.io.IOException;

public interface SaveToFile {
    default void saveToFile(String string) {
        try (FileWriter file = new FileWriter("file.txt")) {
            file.append(string);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
