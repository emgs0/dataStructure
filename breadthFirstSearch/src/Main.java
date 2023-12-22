/**
 * The {@code Main} class demonstrates the usage of an Adjacency Matrix to represent a graph
 * and performs a Breadth-First Search (BFS) traversal on the graph.
 * An Adjacency Matrix is a 2D array used to store 1s and 0s to represent edges in a graph.
 * The number of rows equals the number of unique nodes, and the number of columns equals the number of unique nodes.
 * The runtime complexity to check an edge is O(1), and the space complexity is O(v^2), where v is the number of nodes.
 * The BFS traversal is initiated from a specified starting node and visits all its neighbors before moving on to the next level.
 *
 * @see Graph
 * @see Node
 */
public class Main {
    /**
     * The main method demonstrates the creation of a graph, addition of nodes and edges, printing the graph,
     * and performing a Breadth-First Search traversal.
     *
     * @param args The command-line arguments (unused).
     */
    public static void main(String[] args) {
        // Create a graph with 5 nodes
        Graph graph = new Graph(5);

        // Add nodes to the graph
        graph.addNode(new Node('A'));
        graph.addNode(new Node('B'));
        graph.addNode(new Node('C'));
        graph.addNode(new Node('D'));
        graph.addNode(new Node('E'));

        // Add edges to the graph
        graph.addEdge(0,1); //A->B
        graph.addEdge(1,2); //B->C
        graph.addEdge(1,4); //B->E
        graph.addEdge(2,3); //C->D
        graph.addEdge(2,4); //C->E
        graph.addEdge(4,0); //E->A
        graph.addEdge(4,2); //E->C

        // Print the graph
        graph.print();
        // Perform Breadth-First Search starting from node with index 2
        graph.breadthFirstSearch(2);
        /*
         * This is how the graph looks:
         *       A -> B
         *       ^   /|
         *       | /  |
         *       |V   V
         *       E <-> C -> D
         */


    }
}