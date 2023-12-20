import java.util.ArrayList;
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
     * Performs a depth-first search starting from a specified source node.
     *
     * @param src The index of the source node for the depth-first search.
     */
    public void depthFirstSearch(int src){
        System.out.println("\nDepth-First Search starting from Node " + nodes.get(src).data + ":");
        boolean[] visited = new boolean[matrix.length];
        dFSHelper(src,visited);

    }

    /**
     * Helper method for performing depth-first search recursively.
     *
     * @param src     The index of the current source node.
     * @param visited An array to track visited nodes.
     */
    private void dFSHelper(int src, boolean[] visited) {
        // If the current node has been visited, return.
        if(visited[src]){
            return;
        }else{
            // Mark the current node as visited and print a message.
            visited[src] = true;
            System.out.println( nodes.get(src).data + " = visited");
        }
        // Explore neighbors of the current node.
        for(int i = 0; i< matrix[src].length; i++){
            // If there is an edge to the neighbor and it has not been visited, recursively visit it.
            if(matrix[src][i] == 1){
                dFSHelper(i,visited);
            }
        }
        return;
    }
}
