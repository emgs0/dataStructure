import java.util.LinkedList;
import java.util.Queue;

/**
 * Queue its a FIFO data structure (First In First Out), the simplest example it's a line of people
 * queues are a collection designed for holding elements prior to processing linear data structure
 * Queues have 3 methods:
 *  insert(a) || offer(e)
 *  remove() || poll()
 *  examine() || peek()
 * In java Queue it's an interface, so to do the job we can choose in a class that extends the interface Queue,
 * it could be LinkedList or PriorityQueue.
 * Queue extends from Collection class, so they inherent methods from Collections
 *      - isEmpty() //return true or false.
 *      - size()
 *      - contains(a) //look for element and return true or false
 * _________________________________________________________________________________________________________________
 * Is useful for:
 * keyboard buffer (letter should appear on the screen in order that they're pressed
 * Printer Queue.
 * Used in linked-list, priorityQueues &
 * *** breadth-first search algorithm ***
 */
public class Main {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<String>();
        System.out.println(queue.isEmpty());
        queue.offer("karen");
        queue.offer("Chad");
        queue.offer("Jose");

        System.out.println(queue);
        System.out.println(queue.size());
        System.out.println(queue.peek());
        queue.poll();
        queue.poll();
        System.out.println(queue.size());
        boolean exist = false;
        exist = queue.contains("karen");
        System.out.println(exist);
    }
}