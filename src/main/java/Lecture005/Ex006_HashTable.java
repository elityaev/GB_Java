package Lecture005;

import java.util.Hashtable;
import java.util.Map;

public class Ex006_HashTable {
    public static void main(String[] args) {
        Map<Integer, String> table = new Hashtable<>();
        table.put(1, "one");
        table.put(2, "two");
        table.put(3, "three");
        System.out.println(table); // {3=three, 2=two, 1=one}
        table.put(null, "null");  // java.lang.NullPointerException
    }
}
