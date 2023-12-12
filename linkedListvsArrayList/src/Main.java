import java.util.ArrayList;
import java.util.LinkedList;

/**
 * This class compares the performance of LinkedList and ArrayList operations.
 */
public class Main {

    /**
     * The main method to execute the performance comparison.
     *
     * @param args Command-line arguments (not used in this example).
     */
    public static void main(String[] args) {
        // Creating instances of LinkedList and ArrayList to store integers.
        LinkedList<Integer> linkedList = new LinkedList<>();
        ArrayList<Integer> arrayList = new ArrayList<>();

        long startTime;
        long endTime;
        long elapsedTime;

        // Populating both data structures with integers from 0 to 999999.
        for (int i = 0; i < 1000000; i++) {
            linkedList.add(i);
            arrayList.add(i);
        }

        // ----------------------------------- linkedList -----------------------------------
        startTime = System.nanoTime();
        // Uncomment and add your operations for LinkedList here.
        // linkedList.get(999999);
        linkedList.remove(500000);
        endTime = System.nanoTime();
        elapsedTime = endTime - startTime;
        System.out.println("LinkedList: \t" + elapsedTime + "ns");
        // Results for LinkedList operations:
        // get(0) = 30300ns - Accessing the first element has moderate cost.
        // get(500000) = 5693300ns - Accessing a middle element has higher cost due to traversal.
        // get(999999) = 16600ns - Accessing the last element is faster due to double-link traversal.
        // remove(0) = 20100ns - Removing the first element involves updating links.
        // remove(500000) = 5128900ns - Removing a middle element has a higher cost due to traversal.

        // ----------------------------------- arrayList -----------------------------------
        startTime = System.nanoTime();
        // Uncomment and add your operations for ArrayList here.
        // arrayList.get(999999);
        arrayList.remove(500000);
        endTime = System.nanoTime();
        elapsedTime = endTime - startTime;
        System.out.println("ArrayList: \t" + elapsedTime + "ns");
        // Results for ArrayList operations:
        // get(0) = 9300ns - Accessing the first element is very fast in ArrayList.
        // get(500000) = 3700ns - Accessing a middle element is faster due to direct indexing.
        // get(999999) = 8200ns - Accessing the last element is still efficient in ArrayList.
        // remove(0) = 627000ns - Removing the first element is slower in ArrayList due to shifting.
        // remove(500000) = 297200ns - Removing a middle element is faster due to direct indexing.

        // Overall, ArrayList tends to perform better in random access and removal of middle elements.
    }
}
