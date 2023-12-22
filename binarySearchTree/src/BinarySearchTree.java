/**
 * The {@code BinarySearchTree} class represents a Binary Search Tree (BST) and provides methods
 * for inserting, displaying, searching, and removing nodes from the tree.
 */
public class BinarySearchTree {
    /**
     * The root of the Binary Search Tree.
     */
    Node root;
    /**
     * Inserts a node with the specified data into the BST.
     *
     * @param node The node to be inserted.
     */
    public void insert(Node node){
        root = insertHelper(root, node);

    }
    /**
     * Private helper method for the insert operation.
     *
     * @param root The current root of the subtree.
     * @param node The node to be inserted.
     * @return The updated root of the subtree.
     */
    private Node insertHelper(Node root, Node node){
        int data = node.data;
        if(root ==null){
            root = node;
            return root;
        } else if (data< root.data) {
            root.left = insertHelper(root.left,node);
        } else {
            root.right = insertHelper(root.right, node);
        }
        return root;
    }
    /**
     * Displays the elements of the BST in ascending order.
     */
    public void display(){
        displayHelper(root);
    }
/**
 * Private helper method for the display operation.
 *
 * @param root The current root of the subtree.
 */
    private void displayHelper(Node root){
        if(root !=null){
            displayHelper(root.left); //root.right if we want a decreasing order
            System.out.println(root.data);
            displayHelper(root.right); //root.left if we want a decreasing order
        }
    }
    /**
     * Searches for a node with the specified data in the BST.
     *
     * @param data The data value to search for.
     * @return {@code true} if the data is found, {@code false} otherwise.
     */

    public boolean search(int data){
        return searchHelper(root, data);
    }
    /**
     * Private helper method for the search operation.
     *
     * @param root The current root of the subtree.
     * @param data The data value to search for.
     * @return {@code true} if the data is found, {@code false} otherwise.
     */

    private boolean searchHelper(Node root, int data){
        if(root == null){
            return false;
        } else if (root.data == data){
            return true;
        } else if (root.data>data) {
            return searchHelper(root.left, data);
        } else{
            return searchHelper(root.right, data);
        }
    }
    /**
     * Removes a node with the specified data from the BST.
     *
     * @param data The data value to be removed.
     */
    public void remove(int data){
        if(search(data)){
            removeHelper(root,data);
        }else{
            System.out.println( data + " couldn't be found!!!");
        }
    }
    /**
     * Private helper method for the remove operation.
     *
     * @param root The current root of the subtree.
     * @param data The data value to be removed.
     * @return The updated root of the subtree.
     */
    public Node removeHelper(Node root, int data){
        if(root ==null){
            return root;
        }else if (data < root.data){
            root.left = removeHelper(root.left,data);
        }else if (data> root.data){
            root.right = removeHelper(root.right, data);
        }else{ //node found
            if(root.left == null && root.right ==null){
                root = null;
            } else if (root.right !=null) { //found a successor to replace this node
                root.data = successor(root);
                root.right = removeHelper(root.right, root.data);
            } else if (root.left !=null) { //found a predecessor to replace this node
                root.data = predecessor(root);
                root.left = removeHelper(root.left, root.data);
            }
        }
        return root;
    }
    /**
     * Private helper method to find the successor (the least value below the right child of the given root node).
     *
     * @param root The current root node.
     * @return The value of the successor.
     */
    private int successor(Node root){ //find the least value below the right child of this root node
        root = root.right;
        while(root.left !=null){
            root = root.left;
        }
        return root.data;
    }
    /**
     * Private helper method to find the predecessor (the greatest value below the left child of the given root node).
     *
     * @param root The current root node.
     * @return The value of the predecessor.
     */
    private int predecessor(Node root){//find the greatest value below the left child of this root node
        root = root.left;
        while(root.right !=null){
            root = root.right;
        }
        return root.data;
    }
}
