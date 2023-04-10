package Lecture006;

import java.util.Arrays;
import java.util.HashSet;

public class Ex002_MathSet {
    public static void main(String[] args) {
        var a = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7));
        var b = new HashSet<>(Arrays.asList(1, 3, 5, 7, 11, 13, 17));
        var u = new HashSet<Integer>(a);
        u.addAll(b);
        var r = new HashSet<>(a);
        r.retainAll(b);
        var s = new HashSet<>(a);
        s.removeAll(b);
        System.out.println(a);  // [1, 2, 3, 4, 5, 6, 7]
        System.out.println(b);  // [1, 17, 3, 5, 7, 11, 13]
        System.out.println(u);  // [1, 17, 2, 3, 4, 5, 6, 7, 11, 13] - объединение множеств
        System.out.println(r);  // [1, 3, 5, 7] - пересечение множеств
        System.out.println(s);  // [2, 4, 6] - разность множеств
        boolean res = a.addAll(b);
        System.out.println(res);
    }
}
