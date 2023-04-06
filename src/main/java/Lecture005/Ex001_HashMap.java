package Lecture005;

import java.util.HashMap;
import java.util.Map;

public class Ex001_HashMap {
    public static void main(String[] args) {
        Map<Integer, String> db = new HashMap<>();
        db.putIfAbsent(1, "one"); // не переписывает значение, если такой ключ уже есть
        db.put(2, "two");  // если есть такой ключ, то перезапишет значение
        db.put(null, "!null");
        System.out.println(db);  // {null=!null, 1=one, 2=two}
        System.out.println(db.get(1));  // one
        System.out.println(db.get(44));  // null
        db.remove(null);
        System.out.println(db);  // {1=one, 2=two}
        System.out.println(db.containsValue("one"));  // true
        System.out.println(db.containsKey(1));  // true
        System.out.println(db.keySet());  // [1, 2]
        System.out.println(db.values());  // [one, two]
    }
}
