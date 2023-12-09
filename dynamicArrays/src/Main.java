/**
 * The Main class demonstrates the usage of the DynamicArray class.
 */
public class Main {

    /**
     * The main method serves as the entry point for the program.
     *
     * @param args The command line arguments (not used in this example).
     */
    public static void main(String[] args) {
        // Create a DynamicArray with a custom initial capacity
        DynamicArray dynamicArray = new DynamicArray(5);
        // System.out.println(dynamicArray.capacity);
        //DynamicArray dynamicArray = new DynamicArray(); // Uncomment this line for default capacity

        // Add elements to the DynamicArray
        dynamicArray.add("A");
        dynamicArray.add("B");
        dynamicArray.add("C");
        dynamicArray.add("D");
        dynamicArray.add("E");
        dynamicArray.add("F");

        // Delete elements from the DynamicArray
        dynamicArray.delete("A");
        dynamicArray.delete("B");
        dynamicArray.delete("C");

        // Insert an element at a specific index
        dynamicArray.insert(0, "x");

        // Delete an element by value
        dynamicArray.delete("A");

        // Search for an element and print its index
        System.out.println("data found in index: " + dynamicArray.search("C"));

        // Print the contents of the DynamicArray
        System.out.println(dynamicArray);

        // Print the size of the DynamicArray
        System.out.println("size: " + dynamicArray.size);

        // Print the current capacity of the DynamicArray
        System.out.println("capacity: " + dynamicArray.capacity);

        // Check if the DynamicArray is empty and print the result
        System.out.println("empty: " + dynamicArray.isEmpty());
    }
}
