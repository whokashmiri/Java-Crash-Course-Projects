package DSA.Collections;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;

public class Deque2 {
    public static void main(String[] args) {
//        Deque<Integer> queue = new ArrayDeque<>();
//        queue.add(21);
//        queue.add(98);
//        queue.add(8);
//        queue.offerFirst(1);
//        queue.offerLast(5);
//        System.out.println(queue);
//        System.out.println(queue.peek());
//        System.out.println(queue);
//        System.out.println(queue.element());
//        System.out.println(queue);
//        System.out.println(queue.poll());
//        System.out.println(queue);
        ArrayDeque<Integer> integers = new ArrayDeque<>();
        integers.push(2);
        integers.push(5);
        integers.push(6);
        integers.push(9);
        System.out.println(integers);
        System.out.println(integers.pop());
        System.out.println(integers);

    }
}
