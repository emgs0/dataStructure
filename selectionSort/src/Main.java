/**
 * The Main class demonstrates the Selection Sort algorithm on an array of integers.
 * Selection sort's algorithm searches through an array and keeps track of the
 * minimum value during each iteration.
 * At the end of each iteration, elements are swapped to arrange them in ascending order.
 * It has a quadratic time complexity of O(n^2),
 * making it suitable for small data sets but inefficient for large data sets.
 */
public class Main {
    /**
     * The main method initializes an array of integers,
     * performs selection sort on it, and then prints the sorted array.
     * @param args The command-line arguments (unused in this program).
     */
    public static void main(String[] args) {
        int [] array = {8,7,9,2,3,1,5,4,6};
        selectionSort(array);
        for(int i: array){
            System.out.print(i);
        }
    }
    /**
     * Sorts an array of integers using the Selection Sort algorithm.
     * @param array The array of integers to be sorted.
     */
    private static void selectionSort(int[] array) {
        for(int i=0; i< array.length-1;i++){
            int minNumber = i;
            for(int j=i+1; j<array.length;j++){
                if(array[minNumber]>array[j]){
                    minNumber = j;
                }
            }
            // Swap elements to arrange them in ascending order
            int temp = array[i];
            array[i] = array[minNumber];
            array[minNumber] = temp;
        }
    }
}