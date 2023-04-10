package Seminar006;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.Objects;

public class ObjectsSerialization {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        String[] str = {"My coll text", "second value", "22222"};

        Path path = Path.of("file.txt");
        OutputStream outputStream = Files.newOutputStream(path);
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
        objectOutputStream.writeObject(str);

//        InputStream inputStream = Files.newInputStream(path);
//        ObjectInputStream objectInputStream = new ObjectInputStream(inputStream);
//        Object o = objectInputStream.readObject();
//        String[] str = (String[]) o;
//        System.out.println(Arrays.toString(str));
    }
}
