package lecture_2;
import java.io.File;

public class fileSystemDemo {
    public static void main(String[] args) {
        String pathProject = System.getProperty("user.dir");
        String pathFile = pathProject.concat("/file.txt");
        File f3 = new File(pathFile);
        System.out.println(f3.getAbsolutePath());

        System.out.println(pathFile);
        File f1 = new File("file.txt");
        File f2 = new File("D:\\GeekBrains\\Java\\seminar_1\\src\\main\\java\\lecture_2\\file.txt");
        System.out.println(f1.getAbsolutePath());
        System.out.println(f2.getAbsolutePath());
    }
}
