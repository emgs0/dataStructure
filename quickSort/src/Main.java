/**
 * The Main class demonstrates the Quicksort algorithm on an array of integers.
 * Quicksort is a divide-and-conquer algorithm that selects a pivot element and
 * partitions the array into two sub-arrays: elements smaller than the pivot and
 * elements greater than the pivot. This process is recursively applied to sort the array.
 * It has a run-time complexity of O(n log(n)) in the average and best cases, but O(n^2) in the worst case
 * (e.g., when the array is already sorted in ascending or descending order).
 * The space complexity is O(log(n)) due to recursion.
 *  *
 *  Algorithm Steps:
 *      Choose a pivot element from the array.
 *      Partition the array into two sub-arrays: elements smaller than the pivot and elements greater than the pivot.
 *      Recursively apply Quicksort to the sub-arrays.
 * *
 * Note: The implementation uses the Lomuto partition scheme.
 * *
 * The 'partition' method is a crucial step in the Quicksort algorithm.
 * It selects the last element of the sub-array as the pivot.
 * The method rearranges the elements in the sub-array such that all elements
 * smaller than the pivot are moved to the left, and elements greater than the pivot are moved to the right.
 * After partitioning, the pivot is in its final sorted position.
 * The method returns the index of the pivot after partitioning.
 * *
 * Partitioning Steps:
 *     Initialize the pivot as the last element of the sub-array.
 *     Initialize 'i' as the index of the smaller elements (initially one position before the start).
 *     Iterate through the sub-array from 'start' to 'end - 1' using index 'j'.
 *     If the element at index 'j' is smaller than the pivot, swap it with the element at index 'i' and increment 'i'.
 *     After the iteration, swap the pivot (last element)
 *              with the element at index 'i + 1' to place the pivot in its final position.
 *     Return the index 'i + 1', which is the location of the pivot after partitioning.
 */
public class Main {
    /**
     * The main method initializes an array of integers, performs quicksort on it, and then prints the sorted array.
     *
     * @param args The command-line arguments (unused in this program).
     */
    public static void main(String[] args) {
        int [] array = {8,2,5,3,9,4,7,6,1};

        quickSort(array,0,array.length-1);
        for(int i: array){
            System.out.print(i+" ");
        }
    }
    /**
     * Sorts an array of integers using the Quicksort algorithm.
     *
     * @param array The array of integers to be sorted.
     * @param start The starting index of the sub-array to be sorted.
     * @param end   The ending index of the sub-array to be sorted.
     */
    private static void quickSort(int[] array,int start,int end) {

        if(end<=start) return;
        int pivot = partition(array,start,end);
        quickSort(array,start,pivot-1);     // recursive sorting left partition from the pivot
        quickSort(array,pivot+1,end);      // recursive sorting right partition from the pivot
    }
    /**
     * Partitions an array by selecting a pivot and rearranging elements smaller and larger than the pivot.
     *
     * @param array The array to be partitioned.
     * @param start The starting index of the sub-array to be partitioned.
     * @param end   The ending index of the sub-array to be partitioned.
     * @return The index of the pivot after partitioning.
     */
    private static int partition(int[] array,int start,int end) {
        int pivot = array[end]; //select the last element of the array to look for their place
        int i = start-1;

        for(int j = start; j<=end-1;j++){
            if(array[j]<pivot){
                i++;
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;   //set the number pivot in their right place
            }

        }
        i++; //i variable its independent of the for,
        int temp = array[i];
        array[i] = array[end];
        array[end] = temp;

        return i; //location of the pivot after partitioning
    }
}