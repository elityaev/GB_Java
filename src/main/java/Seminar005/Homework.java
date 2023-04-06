package Seminar005;

import java.util.*;

public class Homework {
    public static void main(String[] args) {
        collectStats("Мороз и солнце день чудесный Еще ты дремлешь друг прелестный Пора красавица проснись");
    }
    /**
     * Есть текст. Нужно извлечь из него все слова и отсортировать по длине.
     * Мороз и солнце день чудесный Еще ты дремлешь друг прелестный Пора красавица проснись
     *
     * и
     * ты
     * Еще
     * день друг пора
     * ...
     */
    static void collectStats(String text) {
        Map<Integer, List<String>> stats = new HashMap<>();
        List<String> wordList = new ArrayList<String>(Arrays.asList(text.split(" ")));
        for (String s : wordList) {
            Integer len = s.length();
            if (!stats.containsKey(len)) {
                List<String> value = new ArrayList<>();
                value.add(s);
                stats.put(len, value);
            } else {
                List<String> value = stats.get(len);
                value.add(s);
                stats.put(len,value);
            }
        }
        for (var key : stats.entrySet()) {
            String string_value = String.join(" ", key.getValue());
            System.out.printf("%s\n", string_value);
        }
    }
}
