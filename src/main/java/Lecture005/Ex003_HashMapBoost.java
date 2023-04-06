package Lecture005;

import java.util.HashMap;
import java.util.Map;

public class Ex003_HashMapBoost {
    public static void main(String[] args) {
        Map<Integer, String> map1 = new HashMap<>();
        Map<Integer, String> map2 = new HashMap<>(9);
        Map<Integer, String> map3 = new HashMap<>(9, 1.0f);  // второй парам указывает
        // количество % до кото необходимо заполнить массив, чтобы его рамер удвоился
    }
}
