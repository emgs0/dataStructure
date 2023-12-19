/**
 * This is an example of an Adjacency List, representing a graph using an array of linked lists.
 * Each linked list represents a node in the graph, and its elements are the adjacent neighbors.
 * Runtime complexity to check an Edge: O(v)
 * Space complexity: O(v+e)
 */
public class Main {
    /**
     * The main method creates a graph, adds nodes to it, establishes edges between nodes, and prints the graph.
     * @param args Command line arguments (not used in this example).
     */
    public static void main(String[] args) {
        // Create a new graph
        Graph graph = new Graph();

        // Add nodes to the graph
        graph.addNode(new Node('A'));
        graph.addNode(new Node('B'));
        graph.addNode(new Node('C'));
        graph.addNode(new Node('D'));
        graph.addNode(new Node('E'));

        // Establish edges between nodes
        graph.addEdge(0, 1);
        graph.addEdge(1, 2);
        graph.addEdge(1, 4);
        graph.addEdge(2, 3);
        graph.addEdge(2, 4);
        graph.addEdge(4, 0);
        graph.addEdge(4, 2);

        // Print the graph
        graph.print();
    }
}
