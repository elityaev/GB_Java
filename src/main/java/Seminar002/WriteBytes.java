package Seminar002;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

public class WriteBytes {
    public static void main(String[] args) throws IOException {

        BufferedOutputStream os = new BufferedOutputStream(new FileOutputStream("file.txt"));
        String text = "plknvkjdofisjdpskmvlsdkmv";
        byte[] bytes = text.getBytes(StandardCharsets.UTF_8);
        System.out.println(Arrays.toString(bytes));
        os.write(bytes);
        os.flush();

        FileInputStream fileInputStream = new FileInputStream("file.txt");
        byte[] bytes1 = fileInputStream.readAllBytes();
        System.out.println(Arrays.toString(bytes1));
    }
}