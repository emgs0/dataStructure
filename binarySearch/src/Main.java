/**
 * The Main class demonstrates the Binary Search algorithm, which finds the position
 * of a target value within a sorted array. During each step, half of the array is dropped.
 */
public class Main {
    /**
     * The main method to execute the Binary Search algorithm.
     *
     * @param args The command-line arguments (not used in this example).
     */
    public static void main(String[] args) {
        int[] array = new int[100000];
        int target =42058;

        // Populate the array with sorted values
        for(int i= 0; i<array.length; i++){
            array[i]=i;
        }

        // Perform Binary Search on the array
        /**
         * int index = Arrays.binarySearch(array,target); using Arrays method for simple Array[];
         * int index = Collections.binarySearch(arrayList, key); using collections method for ArrayList<>();
         * For LinkedList we must create our own method to sort and do the search, like below.
         */


        int index = binarySearch(array,target);
        if(index == -1){
            System.out.println(target+" NOT FOUND!");
        }else{
            System.out.println("Element found at:"+index );
        }
    }


    /**
     * Performs Binary Search on a sorted array to find the specified target value.
     *
     * @param array  The sorted array to be searched.
     * @param target The value to search for in the array.
     * @return The index of the target value in the array, or -1 if not found.
     */
    private static int binarySearch(int[] array, int target) {
        int low = 0;
        int high = array.length-1;
        while(low<=high){
            int middle = low+(high-low)/2;
            int value = array[middle];
            System.out.println("middle: "+ value);
            if(value<target){
                low = middle+1;
            }else if(value>target){
                high = middle-1;
            }else{
                return middle; //target found
            }
        }
        return -1; // not found
    }
}