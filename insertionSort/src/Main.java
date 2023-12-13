/**
 * The Main class demonstrates the Insertion Sort algorithm on an array of integers.
 * Insertion sort involves comparing elements to the left and shifting elements to the right
 * to make room to insert a value in its correct position.
 * It has a quadratic time complexity of O(n^2), making it suitable for small data sets
 * but inefficient for large data sets.
 */
public class Main {
    /**
     * The main method initializes an array of integers, performs insertion sort on it, and then prints the sorted array.
     *
     * @param args The command-line arguments (unused in this program).
     */
    public static void main(String[] args) {
        int [] array ={9,1,8,2,7,3,6,5,4};
        insertionSort(array);
        for(int i : array){
            System.out.print(i+" ");
        }
    }
    /**
     * Sorts an array of integers using the Insertion Sort algorithm.
     *
     * @param array The array of integers to be sorted.
     */
    private static void insertionSort(int[] array) {
        for(int i=1; i< array.length;i++){
            int temp = array[i];
            int j = i-1;

            // Shift elements to the right to make room for the inserted value
            while(j>=0 && array[j]>temp){
                array[j+1] = array[j];
                j--;
            }
            array[j+1] = temp;
        }
    }
}