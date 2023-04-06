package Seminar005;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Map;
import java.util.Objects;

public class Task002 {
    public static void main(String[] args) {
        System.out.println(isCorrectParentheses("()"));
        System.out.println(isCorrectParentheses("[()"));
        System.out.println(isCorrectParentheses("[()]"));
        System.out.println(isCorrectParentheses("{}()[]<><>"));
        System.out.println(isCorrectParentheses("{(]])){()}"));
        System.out.println(isCorrectParentheses("([)]"));
    }
    /**
     * () true
     * [() false
     * [()] true
     * {}()[]<><> true
     * {(]])){()} false
     * ([)] false
     */
    static boolean isCorrectParentheses(String parentheses) {
        char[] chars = parentheses.toCharArray();
        if (chars.length % 2 != 0) {
            return false;
        }

        Map<Character, Character> dict = Map.of(
                '(', ')',
                '[', ']',
                '{', '}',
                '<', '>'
        );

        Deque<Character> symbols = new ArrayDeque<>();
        for (char c :chars){
            if (dict.containsKey(c)) {
                symbols.add(c);
            } else {
                if (symbols.isEmpty()) {
                    return false;
                }

                Character lastSymbol = symbols.pollLast();
                if (!Objects.equals(dict.get(lastSymbol), c)) {
                    return false;
                }
            }
        }
        return symbols.isEmpty();
    }
}
