import java.util.ArrayList;
import java.util.LinkedList;

/**
 * The Graph class represents an adjacency list graph.
 */
public class Graph {
    /** The adjacency list containing linked lists of nodes. */
    private final ArrayList<LinkedList<Node>> adjacencyList;

    /**
     * Constructs an empty graph with an empty adjacency list.
     */
    public Graph() {
        adjacencyList = new ArrayList<>();
    }

    /**
     * Adds a new node to the graph.
     * @param node The node to be added.
     */
    public void addNode(Node node) {
        // Create a new linked list for the current node and add it to the adjacency list
        LinkedList<Node> currentList = new LinkedList<>();
        currentList.add(node);
        adjacencyList.add(currentList);
    }

    /**
     * Adds an edge between two nodes in the graph.
     * @param src The index of the source node.
     * @param dest The index of the destination node.
     */
    public void addEdge(int src, int dest) {
        // Get the linked list associated with the source node
        LinkedList<Node> currentList = adjacencyList.get(src);

        // Get the destination node and add it to the linked list
        Node destNode = adjacencyList.get(dest).get(0);
        currentList.add(destNode);
    }

    /**
     * Checks if there is an edge between two nodes in the graph.
     * @param src The index of the source node.
     * @param dest The index of the destination node.
     * @return true if there is an edge, false otherwise.
     */
    public boolean checkEdge(int src, int dest) {
        // Get the linked list associated with the source node
        LinkedList<Node> currentList = adjacencyList.get(src);

        // Get the destination node
        Node destNode = adjacencyList.get(dest).get(0);

        // Check if the destination node is present in the linked list
        for (Node node : currentList) {
            if (node == destNode) {
                return true; // Edge found
            }
        }
        return false; // Edge not found
    }

    /**
     * Prints the adjacency list representation of the graph.
     */
    public void print() {
        for (LinkedList<Node> currentList : adjacencyList) {
            for (Node node : currentList) {
                System.out.print(node.data + " -> ");
            }
            System.out.println(" ");
        }
    }
}