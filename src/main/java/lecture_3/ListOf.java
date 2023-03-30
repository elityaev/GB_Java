package lecture_3;

import java.util.ArrayList;
import java.util.List;

public class ListOf {
    public static void main(String[] args) {
        Character value = null;
        List<Character> list1 = List.of('E', 'v', 'g', 'e', 'n', 'i', 'y');
        System.out.println(list1); // [E, v, g, e, n, i, y]
//        list1.remove(1); // java.lang.UnsupportedOperationException
        List<Character> list2 = List.copyOf(list1);
        System.out.println(list2); // [E, v, g, e, n, i, y]
//        list2.add('!');  // java.lang.UnsupportedOperationException
        System.out.println(list1);
        List<Character> list3 = new ArrayList<Character>();
        List<Character> list4 = List.copyOf(list3);
        list3.add('!');
        System.out.println(list3);  // [!]
        System.out.println(list4);  // []
    }
}
