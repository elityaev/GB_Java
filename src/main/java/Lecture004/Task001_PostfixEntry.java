package Lecture004;

import java.util.Arrays;
import java.util.Stack;

import static java.lang.Character.isDigit;

public class Task001_PostfixEntry {
    public static void main(String[] args) {
//        var exp = "1 2 3 * +".split(" ");  // 1 + 2 * 3
        var exp = "20 30 - 10 /".split(" ");  // (20 - 30) * 10
        int res = 0;
        System.out.println(Arrays.toString(exp));

        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < exp.length; i++) {
            char elem = exp[i].charAt(0);
            if (isDigit(elem)) {
                st.push(Integer.parseInt(exp[i]));
            } else {
                switch (elem) {
                    case '+':
                        res = st.pop() + st.pop();
                        st.push(res);
                        break;
                    case '-':
                        res = -st.pop() + st.pop();
                        st.push(res);
                        break;
                    case '*':
                        res = st.pop() * st.pop();
                        st.push(res);
                        break;
                    case '/':
                        int first = st.pop();
                        int second = st.pop();
                        res = second / first;
                        st.push(res);
                        break;
                    default:
                        break;
                }
            }
        }
        System.out.printf("%d\n", st.pop());
    }
}
