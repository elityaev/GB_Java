package Lecture003;

public class object {
    public static void main(String[] args) {
        Object o = "1"; GetType(o);    // java.lang.Integer
        o = true; GetType(o);         // java.lang.Double
    }
    static void GetType(Object obj) {
        System.out.println(obj.getClass().getName());
    }
}
