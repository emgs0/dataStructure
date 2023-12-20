/**
 * The {@code Main} class serves as a demonstration of an Adjacency Matrix, a 2D array for storing
 * edges in a graph using 1s and 0s. The primary focus is on showcasing the implementation of
 * a depth-first search algorithm within the {@link Graph} class.
 * In this project, a simple graph is created with nodes labeled 'A' through 'E', and edges
 * are added to represent connections between nodes. The depth-first search is then performed
 * from a specified source node, demonstrating the traversal order of the graph.
 * The runtime complexity for checking edge existence is O(1), and the space complexity for
 * the adjacency matrix is O(v^2), where v is the number of nodes.
 *
 * @see Graph
 * @see Node
 */
public class Main {
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

        graph.depthFirstSearch(4);
        /*
         * This is how the graph looks:
         *       A -> B
         *       ^   /|
         *       | /  |
         *       |V   V
         *       E <-> C -> D
         * src = 3 its D, so if we start our depthFirstSearch with 3, we don't anywhere to go,
         * so only visits the node D, in every other node visits all in order.
         * if we start with node C, visit first node D, and because D doesn't any other connection return to node C,
         * looking for other node connected in this case E.
         */
    }
}