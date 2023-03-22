package seminar_2;

public class Task_1 {
    public static void main(String[] args) {
        String s = "aaaabbbcdde";
        String compressed = compress(s);
        System.out.println(compressed);
    }

    /**
     * aaaabbbcdd -> a4b3cd2
     */
    public static String compress(String input) {
        char current = input.charAt(0);
        int count = 1;
        String result = "";
        // Можно символы строки собрать в массив и дальше с ним работать по индексам
//        char[] chars = input.toCharArray();
        for (int i = 1; i < input.length(); i++) {
            char c = input.charAt(i);
            if (current == c) {
                count++;
            } else {
                if (count > 1) {
                    result += String.valueOf(current) + count;
                } else {
                    result += current;
                }
                current = c;
                count = 1;
            }
        }
        if (count > 1) {
            result += String.valueOf(current) + count;
        } else {
            result += current;
        }
        return result;
    }
}
