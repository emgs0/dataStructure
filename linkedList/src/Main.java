import java.util.LinkedList;

/**
 * Stores a series of Nodes in two parts [data|address]
 * Nodes are in non-consecutive memory locations
 * Elements are linked using pointers.
 *__________________________________________________________________________________________________*
 *                                            Single Linked List                                    *
 *                              Node                  Node               Node                       *
 *                         [data|address]  ->  [data|address]  ->  [data|address]                   *
 * -------------------------------------------------------------------------------------------------*
 *                                          Double Linked List                                      *
 *              Node                        Node                        Node                        *
 *   [address|data|address]  <->  [address|data|address]  <->  [address|data|address]               *
 * -------------------------------------------------------------------------------------------------*
 *                                        Advantages
 *      *   Dynamic Data Structure (allocates needed memory while running)
 *      *   Insertion and Deletion of Nodes is easy.
 *      *   No/Low memory waste
 *                                       Disadvantages
 *      *   Greater memory usage (additional pointer)
 *      *   No random access of elements (no index[i])
 *      *   Accessing/Searching elements is more time-consuming.
 *                                      Uses
 *      *   implement Stack/Queues
 *      *   GPS navigation
 *      *   Music Playlist
 */
public class Main {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<String>();
        //Treating as a Stack (occupy more memory because it has the memory address)

        linkedList.push("a"); //offer("a");
        linkedList.push("b"); //offer("b");
        linkedList.push("c"); //offer("c");
        linkedList.push("d"); //offer("d");
        linkedList.push("f"); //offer("f");
        //linkedList.pop(); poll
        linkedList.add(4,"e");
        linkedList.remove("e");
        System.out.println(linkedList.peekFirst());
        System.out.println(linkedList.peekLast());
        linkedList.addFirst("0");
        linkedList.addLast("g");
        System.out.println(linkedList);

        String first = linkedList.removeFirst();
        String last = linkedList.removeLast();
        System.out.println(linkedList);
        System.out.println(linkedList.reversed());
    }
}