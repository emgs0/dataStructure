/**
 * The Main class demonstrates a linear search algorithm on an array.
 */
public class Main {

    /**
     * The main method to execute the linear search algorithm.
     *
     * @param args The command-line arguments (not used in this example).
     */
    public static void main(String[] args) {
        // Linear Search: Iterate through a collection one element at a time
        // Runtime Complexity: O(n) (linear time)
        // Disadvantages:
        //    - Slow for large data sets
        // Advantages:
        //    - Fast for searches of small to medium data sets
        //    - Doesn't need to be sorted
        //    - Useful for data structures that don't have random access (e.g., LinkedList)

        // Sample array for the demonstration
        int[] array = {9, 1, 8, 2, 7, 3, 6, 4, 5};

        // Perform linear search to find the index of the element 1
        int index = linearSearch(array, 4);

        // Display the result based on the linear search
        if (index != -1) {
            System.out.println("Element found at index: " + index);
        } else {
            System.out.println("Element not found");
        }
    }

    /**
     * Performs a linear search on the given array to find the specified value.
     *
     * @param array The array to be searched.
     * @param value The value to search for in the array.
     * @return The index of the first occurrence of the value in the array, or -1 if not found.
     */
    private static int linearSearch(int[] array, int value) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                return i;
            }
        }
        return -1;
    }
}
