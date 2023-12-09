/**
 * The DynamicArray class represents a dynamically resizing array.
 * It provides methods for adding, inserting, deleting, searching, and more.
 */
public class DynamicArray {
    int size;
    int capacity = 10;
    Object[] array;

    /**
     * Constructs a DynamicArray with the default capacity.
     */
    public DynamicArray() {
        this.array = new Object[capacity];
    }

    /**
     * Constructs a DynamicArray with a specified initial capacity.
     *
     * @param capacity The initial capacity of the DynamicArray.
     */
    public DynamicArray(int capacity) {
        this.capacity = capacity;
        this.array = new Object[capacity];
    }

    /**
     * Adds an element to the end of the DynamicArray.
     * If the array is full, it will be resized.
     *
     * @param data The data to be added to the DynamicArray.
     */
    public void add(Object data) {
        if (size >= capacity) {
            grow(); // Example: grow the array if it's full
        }
        array[size] = data;
        size++;
    }

    /**
     * Inserts an element at the specified index in the DynamicArray.
     * If the array is full, it will be resized.
     *
     * @param index The index at which to insert the data.
     * @param data  The data to be inserted into the DynamicArray.
     */
    public void insert(int index, Object data) {
        if (size >= capacity) {
            grow(); // Example: grow the array if it's full
        }
        for (int i = size; i > index; i--) {
            array[i] = array[i - 1];
        }
        array[index] = data;
        size++;
    }

    /**
     * Deletes the first occurrence of the specified data from the DynamicArray.
     * If the array size is less than one-third of the capacity, it will be shrunk.
     *
     * @param data The data to be deleted from the DynamicArray.
     */
    public void delete(Object data) {
        for (int i = 0; i < size; i++) {
            if (array[i] == data) {
                // Example: shrink the array if size is less than one-third of capacity
                if (size <= (int) (capacity / 3)) {
                    shrink();
                }
                break;
            }
        }
    }

    /**
     * Searches for the first occurrence of the specified data in the DynamicArray.
     *
     * @param data The data to search for in the DynamicArray.
     * @return The index of the first occurrence of the data, or -1 if not found.
     */
    public int search(Object data) {
        for (int i = 0; i < size; i++) {
            if (array[i] == data) {
                return i; // Example: return the index of the found data
            }
        }
        return -1;
    }

    /**
     * Increases the capacity of the DynamicArray by doubling its current capacity.
     * Copies existing elements to the new array.
     */
    private void grow() {
        int newCapacity = (int) capacity * 2;
        Object[] newArray = new Object[newCapacity];

        for (int i = 0; i < size; i++) {
            newArray[i] = array[i];
        }
        capacity = newCapacity;
        array = newArray;
    }

    /**
     * Decreases the capacity of the DynamicArray by half its current capacity.
     * Copies existing elements to the new array.
     */
    private void shrink() {
        int newCapacity = (int) capacity / 2;
        Object[] newArray = new Object[newCapacity];

        for (int i = 0; i < size; i++) {
            newArray[i] = array[i];
        }
        capacity = newCapacity;
        array = newArray;
    }

    /**
     * Checks if the DynamicArray is empty.
     *
     * @return True if the DynamicArray is empty, false otherwise.
     */
    public boolean isEmpty() {
        return size == 0;
    }

    /**
     * Returns a string representation of the DynamicArray.
     * The elements are enclosed in square brackets and separated by commas.
     *
     * @return A string representation of the DynamicArray.
     */
    public String toString() {
        String string = "";
        for (int i = 0; i < capacity; i++) {
            string += array[i] + ", ";
        }
        if (!string.isEmpty()) {
            string = "[" + string.substring(0, string.length() - 2) + "]";
        } else {
            string = "[]";
        }
        return string;
    }
}
