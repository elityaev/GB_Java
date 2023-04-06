package Seminar005;

import java.util.HashMap;
import java.util.Map;

public class Tasks001 {
    public static void main(String[] args) {
        System.out.println(isMatches("foo", "bar"));
        System.out.println(isMatches("paper", "title"));
        System.out.println(isMatches("egg", "add"));
        System.out.println(isMatches("abcde", "bcdef"));
    }
    /**
     * Проверить, что 2 строки являются изоморфными в том смысле, что одну букву в первом слове можно
     * заменить на какую-то во втором.
     * Примеры:
     * (foo, bar) -> false f -> b, o -> a
     * (paper, title) -> true -> p -> t, a -> i, e -> l, r -> e
     * (egg, add) -> true -> e -> a, g -> d,
     * (abcde, bcdef) -> true -> a -> b, b -> c, c -> d, d -> e, e -> f
     */
    static boolean isMatches(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }
        Map<Character, Character> matchMap = new HashMap<>();
        for (int i = 0; i < s1.length(); i++) {
            if (matchMap.containsKey(s1.charAt(i))) {
                Character value = matchMap.get(s1.charAt(i));
                if (value != s2.charAt(i)) {
                    return false;
                }
            }
            matchMap.put(s1.charAt(i), s2.charAt(i));
        }
    return true;
    }
}
