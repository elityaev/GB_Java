package Lecture002;
import java.io.*;

public class tryDemo2 {
    public static void main(String[] args) {
        try {
            String pathProject = System.getProperty("user.dir"); // прописывает путь к текущей папке
            String pathFile = pathProject.concat("/file.txt"); // указываем конкретный файл
            File f3 = new File(pathFile); // создать файл и связать с переменно f3 по указанному пути
            System.out.println("try");
        } catch (Exception e) {
            System.out.println("catch");
        }
        finally
        { System.out.println("finally"); }
    }
}
