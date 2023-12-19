/**
 * This project shows an example of an Adjacency Matrix, which is a 2D array to store 1s and 0s to represent edges.
 * The number of rows = the number of unique nodes, and the number of columns = the number of unique nodes.
 * *
 * Runtime complexity to check an edge: O(1)
 * Space complexity: O(v^2)
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

        /*
         * This is how the graph looks:
         *       A -> B
         *       ^   /|
         *       | /  |
         *       |V   V
         *       E <-> C -> D
         */

        // Check if an edge exists
        System.out.println("checks if exist edges: "+graph.checkEdge(3,2)); //if 0 then return false
        System.out.println("checks if exist edges: "+graph.checkEdge(4,0)); //if 1 then return true

    }
}