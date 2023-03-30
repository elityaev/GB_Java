package Seminar002;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class writeFile {
    public static void main(String[] args) throws IOException {
//        FileOutputStream fileOutputStream = new FileOutputStream("file.txt");
        BufferedOutputStream os = new BufferedOutputStream(new FileOutputStream("file.txt"));

        String text = "My text";
        byte[] bytes = text.getBytes(StandardCharsets.UTF_8);
//        fileOutputStream.write(bytes);
//        fileOutputStream.close();
        os.write(bytes);
        os.flush();
    }
}
