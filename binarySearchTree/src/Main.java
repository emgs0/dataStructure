/**
 * The {@code Main} class serves as an entry point to demonstrate the Binary Search Tree (BST) data structure.
 * A BST is a tree data structure where each node is greater than its left child but less than its right child.
 * This implementation showcases the BST algorithm to insert, display, search, and remove nodes.
 * The tree starts with an unbalanced order of numbers: root = 5, with sons 1 and 9. Ideally, in a balanced tree,
 * the sons of 5 would be 4 and 6.
 * <p>
 * Time complexity:
 * - Best case: O(log n)
 * - Worst case: O(n)
 * <p>
 * Space complexity: O(n)
 */
public class Main {
    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();
        tree.insert(new Node(5));
        tree.insert(new Node(1));
        tree.insert(new Node(9));
        tree.insert(new Node(2));
        tree.insert(new Node(7));
        tree.insert(new Node(3));
        tree.insert(new Node(6));
        tree.insert(new Node(4));
        tree.insert(new Node(8));

        tree.display(); // Prints the tree in ascending order

        System.out.println(tree.search(6));
        tree.remove(6);
        System.out.println(tree.search(6));
    }
}