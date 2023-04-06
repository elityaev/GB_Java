package Seminar005;

import java.util.*;

public class MapStorageMethods {
    public static void main(String[] args) {
        Map<String, Integer> hashMap = new HashMap<>();  // в произвольном порядке
        Map<String, Integer> treeMap = new TreeMap<>();  // бинарное дерево, в отсортированом порядке по ключам
        Map<String, Integer> lincedHashMap = new LinkedHashMap<>();  // гарантирует упорядоченность по добавлению


        // [b0, b1, b2, b3, b4, b5, ..., b15]  // bucket
        hashMap.put("key", 100);
        // key -> hash [-2^32, 2^32 - 1] вычисляется число, затем вычисляется номер
        // бакета путем деления значения хэша на количество бакетов (берется остаток)
        // hash = 18 => [Entry(key - "key", hash, value - 100)] -> b2

        hashMap.put("key", 200);
        // [Entry(key - "key", hash, value - 200)]

        hashMap.put("key_2", 200);
        // hash = 18 => [Entry(key - "key_2", hash, value - 200)] -> b2 ->
        // -> [Entry(key - "key", hash, value - 200), Entry(key - "key_2", hash, value - 200)]

        Map<String, Integer> compareTreeMap = new TreeMap<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                int o1length = o1.length();
                int o2length = o2.length();
                if (o1length < o2length) {
                    return -1;
                } else if (o1length > o2length) {
                    return 1;
                }
                return 0;
            }
        });
    }
}
