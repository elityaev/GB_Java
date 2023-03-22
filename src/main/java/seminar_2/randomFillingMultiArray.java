package seminar_2;

import java.util.Arrays;
import java.util.Random;

public class randomFillingMultiArray {
    public static void main(String[] args) {
        int[][] array = new int[4][4];
        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = random.nextInt(10);
            }
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println(Arrays.deepToString(array));
    }
}
