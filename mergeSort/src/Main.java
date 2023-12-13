/**
 * The Main class demonstrates the Merge Sort algorithm on an array of integers.
 * Merge sort is a divide-and-conquer algorithm that recursively divides an array into two halves,
 * sorts each half, and then merges them back together.
 * It has a run-time complexity of O(n log n) and a space complexity of O(n).
 * Algorithm Steps:
 *      Recursively divide the array into two halves.
 *      Sort each half using the merge sort algorithm.
 *      Merge the sorted halves back together.
 */
public class Main {
    /**
     * The main method initializes an array of integers, performs merge sort on it, and then prints the sorted array.
     *
     * @param args The command-line arguments (unused in this program).
     */
    public static void main(String[] args) {
        int [] array = {8,2,5,3,4,7,6,1,2};

        mergeSort(array);
        for(int i =0; i<array.length;i++){
            System.out.print(array[i]+" ");
        }
    }
    /**
     * Sorts an array of integers using the Merge Sort algorithm.
     *
     * @param array The array of integers to be sorted.
     */
    private static void mergeSort(int[] array) {
        int length = array.length;
        if(length<= 1 ) return; // Base case: stop recursion when the array has one or zero elements

        int middle = length/2;
        int[] leftArray = new int[middle];
        int[] rightArray = new int[length-middle];
        int i=0; // Index for the left array
        int j =0; // Index for the right array

        for(; i<length;i++){
            if(i<middle){
                leftArray[i] = array[i];
            }else{
                rightArray[j] = array[i];
                j++; // Increment j because the for loop only increments i
            }
        }
        // Recursively apply merge sort to the left and right halves
        mergeSort(leftArray);
        mergeSort(rightArray);
        // Merge the sorted left and right halves back into the original array
        merge(leftArray,rightArray,array);

    }
    /**
     * Merges two sorted arrays into a single sorted array.
     *
     * @param leftArray  The left sorted array.
     * @param rightArray The right sorted array.
     * @param array      The array to be merged.
     */
    private static void merge(int[] leftArray, int[] rightArray, int[] array){
        int leftSize = array.length/2;
        int rightSize = array.length-leftSize;
        int i =0, l =0, r =0; // Index variables

        // Merge elements from leftArray and rightArray in sorted order
        while (l < leftSize && r < rightSize){
            if(leftArray[l] < rightArray[r]){
                array[i] = leftArray[l];
                i++;
                l++;
            }else{
                array[i] = rightArray[r];
                i++;
                r++;
            }
        }
        // Copy any remaining elements from leftArray
        while(l < leftSize){
            array[i] = leftArray[l];
            i++;
            l++;
        }
        // Copy any remaining elements from rightArray
        while(r < leftSize){
            array[i] = rightArray[r];
            i++;
            r++;
        }
    }
}