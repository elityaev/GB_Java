package Seminar001;

public class task_1 {
    /**
     * Дан массив двоичных чисел, например [1,1,0,1,1,1], вывести максимальное количество подряд идущих 1.
     */
    public static void main(String[] args) {
        int[] arr = {1,1,0,1,1,1,1};
        int count = 0;
        int max_count = 0;
        for (int i: arr) {
            if (i == 1) {
                count++;
            } else {
                if (count > max_count) {
                    max_count = count;
                }
                count = 0;
            }
        }
        if (count > max_count) {
            max_count = count;
        }
        System.out.println(max_count);
    }
}