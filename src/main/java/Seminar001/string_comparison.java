package Seminar001;

public class string_comparison {

    public static void main(String[] args) {

        // StringTable (StringPool)
        String s1 = "string";
        String s2 = "string";
        String s3 = new String("string");
        String s4 = new String("string");

        System.out.println(s1 == s2); // true
        System.out.println(s1 == s3); // false
        System.out.println(s3 == s4); // false

        System.out.println(s1.equals(s2)); // true
        System.out.println(s1.equals(s3)); // true
        System.out.println(s3.equals(s4)); // true
    }
}
