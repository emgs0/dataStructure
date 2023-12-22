import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
 * The {@code Graph} class represents a directed graph using an adjacency matrix.
 * Nodes are added to the graph, and edges are represented by non-zero values in the matrix.
 * The graph supports operations such as adding nodes, adding directed edges, and checking the existence of edges.
 */
public class Graph {
    /**
     * A list of nodes in the graph.
     */
    ArrayList<Node> nodes;
    /**
     * The adjacency matrix to represent the edges between nodes.
     * A non-zero value at matrix[i][j] indicates an edge from node i to node j.
     */
    int [][] matrix;
    /**
     * Constructs a new {@code Graph} instance with the specified number of nodes.
     *
     * @param size The number of nodes in the graph.
     */
    Graph(int size){
        nodes = new ArrayList<>();
        matrix = new int[size][size];
    }
    /**
     * Adds a new node to the graph.
     *
     * @param node The node to be added to the graph.
     */
    public void addNode(Node node){
        nodes.add(node);
    }

    /**
     * Adds a directed edge from the source node to the destination node.
     *
     * @param src  The index of the source node.
     * @param dest The index of the destination node.
     */
    public void addEdge(int src, int dest){
        matrix[src][dest]=1;

    }
    /**
     * Checks if an edge exists between the source node and the destination node.
     *
     * @param src  The index of the source node.
     * @param dest The index of the destination node.
     * @return {@code true} if an edge exists, {@code false} otherwise.
     */
    public boolean checkEdge(int src, int dest){
        if(matrix[src][dest]==1){
            return true;
        }else{
            return false;
        }
    }
    /**
     * Prints the adjacency matrix representing the graph.
     * The matrix shows the adjacency within nodes, where each node is represented by a letter.
     * Each column represents a node, and the values in the matrix indicate the existence of edges.
     */
    public void print(){
        System.out.print(" [   ] "); //print a white space
        for(Node node: nodes){
            System.out.print(" [ " + node.data + " ] "); //print headers of the columns (nodes)
        }
        System.out.println();

        for(int i = 0;i<matrix.length;i++){
            System.out.print(" [ " + nodes.get(i).data + " ] ");//print values  of the rows (nodes)

            for(int j=0;j<matrix[i].length; j++){
                System.out.print(" [ " + matrix[i][j] + " ] ");
            }
            System.out.println(" ");
        }
    }
    /**
     * Performs a Breadth-First Search (BFS) traversal starting from a specified source node.
     * BFS visits all the neighbors of the source node before moving on to the next level of nodes.
     *
     * @param src The index of the source node for BFS traversal.
     */
    public void breadthFirstSearch(int src){
        // Create a queue to store nodes to be visited in BFS order
        Queue<Integer> queue = new LinkedList<>();
        // Mark all nodes as not visited initially
        boolean[] visited = new boolean[matrix.length];
        // Start BFS from the source node
        queue.offer(src);       // Enqueue the source node
        visited[src] = true;    // Mark the source node as visited

        // BFS traversal loop
        while(!queue.isEmpty()){
            // Dequeue a node and print it as visited
            src = queue.poll();
            System.out.println(nodes.get(src).data+" = visited");

            // Explore neighbors of the dequeued node
            for(int i = 0; i< matrix[src].length; i++){
                // Check if there is an edge and the neighbor hasn't been visited
                if(matrix[src][i]==1 && !visited[i]){
                    queue.offer(i);         // Enqueue the unvisited neighbor
                    visited[i] = true;      // Mark the neighbor as visited
                }
            }
        }
    }
}
