package Lecture006;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

public class Ex004_LinkedHashSet {
    public static void main(String[] args) {
        var a = new LinkedHashSet<>(Arrays.asList(1,7,2,3,6,4,5));
        var b = new LinkedHashSet<>(Arrays.asList(1,7,2,3,6,4,5));
        a.add(28);
        System.out.println(a);  // [1, 7, 2, 3, 6, 4, 5, 28]
        System.out.println(b);  // [1, 7, 2, 3, 6, 4, 5]
    }
}
