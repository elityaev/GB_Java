package Lecture005;

import java.util.HashMap;
import java.util.Map;

public class Ex002_HashMapEntry {
    public static void main(String[] args) {
        Map<Integer, String> db = new HashMap<>();
        db.putIfAbsent(1, "one");
        db.put(2, "two");
        db.put(3, "three");
        System.out.println(db);  // {1=one, 2=two, 3=three}

        for (var item : db.entrySet()) {
            System.out.printf("[%d: %s]\n", item.getKey(), item.getValue());
            //  [1: one]
            //  [2: two]
            //  [3: three]
        }
    }
}
