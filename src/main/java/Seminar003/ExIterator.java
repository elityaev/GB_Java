package Seminar003;

import java.util.*;

public class ExIterator {
    public static void main(String[] args) {
        // ArrayList -> List -> Collection -> Iterable
        ArrayList<String> list = new ArrayList<>();
        list.add("string");
        list.add("string");
        list.add("string1");


        // Словарь
        Map<String, Integer> map = new HashMap<>();
        map.put("key", 1);
        int x = map.get("key"); //

        for (String s : list) {
            System.out.println(s);
        }

        // Тоже самое
        Iterator var2 = list.iterator();

        while(var2.hasNext()) {
            String s = (String)var2.next();
            System.out.println(s);
        }
        String[] array = {"1", "2", "3", "4"};

        // массив в List'e
        ArrayList<String[]> intArrayList = new ArrayList<>();
        intArrayList.add(array);
        System.out.println(intArrayList);

        // List в массиве
        ArrayList<String>[] a = new ArrayList[5];
        a[2] = list;
        System.out.println(Arrays.asList(a)); // [null, null, [string, string, string1], null, null]
     }
}
