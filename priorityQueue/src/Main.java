import java.util.Collections;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * Priority Queue it's a FIFO data structure that serves the elements
 * with the highest priorities first before elements
 * with lower priority
 */

public class Main {
    public static void main(String[] args) {

        /**
         * this segment of code is a simple queue, to compare the results with the PriorityQueue
         */
        System.out.println("queue (linkedlist)");

        Queue<Double> queue = new LinkedList<>();

        queue.offer(3.0);
        queue.offer(2.5);
        queue.offer(4.0);
        queue.offer(1.5);
        queue.offer(2.0);

        while (!queue.isEmpty()) {
            System.out.println(queue.poll());
        }
        queue = null;
        /**
         * this segment of code is a Priority queue, the return is sorted from lower to higher priority
         * this could work easily with String or Integer and it sorts Alphabetically
         */
        System.out.println("Priority queue");
        queue = new PriorityQueue<>();
        queue.offer(3.0);
        queue.offer(2.5);
        queue.offer(4.0);
        queue.offer(1.5);
        queue.offer(2.0);

        while (!queue.isEmpty()) {
            System.out.println(queue.poll());
        }
        queue = null;
        /**
         * this segment of code is a Priority queue, the return is sorted from higher to lower priority
         */
        System.out.println("Priority queue reverse order");
        queue = new PriorityQueue<>(Collections.reverseOrder());
        queue.offer(3.0);
        queue.offer(2.5);
        queue.offer(4.0);
        queue.offer(1.5);
        queue.offer(2.0);

        while (!queue.isEmpty()) {
            System.out.println(queue.poll());
        }
    }
}