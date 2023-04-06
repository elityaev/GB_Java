package Lecture005;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Ex005_LinkedHashMap {
    public static void main(String[] args) {
        Map<Integer, String> linkmap = new LinkedHashMap<>();
        linkmap.put(11, "one one");
        linkmap.put(1, "two");
        linkmap.put(2, "one");
        System.out.println(linkmap); // {11=one one, 1=two, 2=one}
        Map<Integer, String> map = new HashMap<>();
        map.put(11, "one one");
        map.put(1, "two");
        map.put(2, "one");
        System.out.println(map); // {1=two, 2=one, 11=one one}
    }
}
