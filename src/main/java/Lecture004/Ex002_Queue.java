package Lecture004;

import java.util.LinkedList;
import java.util.Queue;

public class Ex002_Queue {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<Integer>();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        System.out.println(queue); // [1, 2, 3, 4]
        int item = queue.remove();
        System.out.println(queue); // [2, 3, 4]
        queue.offer(2809);
        item = queue.remove();
        System.out.println(queue); // [3, 4, 2809]
        item = queue.remove();
        System.out.println(queue); // [4, 2809]
        item = queue.poll();
        System.out.println(queue);  // [2809]
        item = queue.poll();
        System.out.println(queue); // []
//        item = queue.remove();
//        System.out.println(queue); // java.util.NoSuchElementException
        queue.add(1);
        queue.add(2809);
        System.out.println(queue); // [1, 2809]
        int element  = queue.element();  // извлекает, но не удаляет заголовок очереди, выдает исключ при пустой очереди
        int peek = queue.peek(); // извлекает, но не удаляет заголовок очереди, возвращ null  при пустой очереди
        System.out.println(element); // 1
        System.out.println(peek); // 1
        item = queue.poll();
        item = queue.poll();
        System.out.println(queue); // []
        System.out.println(queue.peek()); // null
        System.out.println(queue.element()); // java.util.NoSuchElementException
    }
}
