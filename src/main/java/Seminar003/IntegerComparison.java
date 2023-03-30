package Seminar003;

public class IntegerComparison {
    public static void main(String[] args) {
        Integer a = 5;
        Integer b = 5;
        Integer c = new Integer(5);
        Integer d = new Integer(5);

        System.out.println(a == b); //TrueSystem.out.println(a == c); // False
        System.out.println(c == d); // False

        System.out.println(a.equals(b));  // True
        System.out.println(a.equals(c));  // True
        System.out.println(c.equals(d));  // True
    }
}
