/**
 * The Main class demonstrates the Bubble Sort algorithm on an array of integers.
 * Bubble sort is an algorithm where pairs of adjacent elements are compared (left and right),
 * and the elements are swapped if they are not in order. It has a quadratic time complexity of O(n^2),
 * making it suitable for small data sets but inefficient for large data sets.
 */
public class Main {
    /**
     * The main method initializes an array of integers, performs bubble sort on it, and then prints the sorted array.
     *
     * @param args The command-line arguments (unused in this program).
     */
    public static void main(String[] args) {
        int [] array = {9,1,8,2,7,3,6,4,5};
        bubbleSort(array);
        for(int i : array){
            System.out.print(i);
        }
    }
    /**
     * Sorts an array of integers using the Bubble Sort algorithm.
     *
     * @param array The array of integers to be sorted.
     */
    private static void bubbleSort(int [] array) {
        for(int i=0; i<array.length-1;i++){ //it must be length-1 to avoid overcharge the array.
            for(int j=0; j<array.length-i-1;j++){
                if(array[j]>array[j+1]){
                    int temp = array[j];
                    array[j]=array[j+1];
                    array[j+1]=temp;
                }
            }
        }
    }
}