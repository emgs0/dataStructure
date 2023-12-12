/**
 * The Main class demonstrates the Interpolation Search algorithm, an improvement over
 * binary search that is best used for uniformly distributed guesses where a value might be.
 * The algorithm calculates probe results to estimate the likely position of the target value.
 * If the probe is incorrect, the search area is narrowed, and a new probe is calculated.
 * Average Case Time Complexity: O(log(log(n)))
 * Worst Case Time Complexity: O(n) [when values increase exponentially]
 */
public class Main {
    /**
     * The main method to execute the Interpolation Search algorithm.
     *
     * @param args The command-line arguments (not used in this example).
     */
    public static void main(String[] args) {
        // Best case scenario: Sorted array with exponentially increasing values
        int[] array = {1,2,4,8,16,32,64,128,256,512,1024};

        // Perform Interpolation Search on the array
        int index = interpolationSearch(array,256);
        if(index !=-1){
            System.out.println("value found at index: "+index);
        }else{
            System.out.println("NOT FOUND");
        }
    }

    /**
     * Performs Interpolation Search on a sorted array to find the specified target value.
     *
     * @param array The sorted array to be searched.
     * @param value The value to search for in the array.
     * @return The index of the target value in the array, or -1 if not found.
     */
    private static int interpolationSearch(int[] array, int value) {
        int high = array.length -1;
        int low = 0;
        while(value >= array[low] && value<=array[high] && low<=high){
            int probe = low + ((high -low)/(array[high]-array[low])) * (value-array[low]);
            System.out.println("probe: "+probe);

            if(array[probe] ==value){
                return probe; //target found;
            }else if(array[probe]<value){
                low = probe+1;
            }else{
                high = probe-1; //target not found
            }
        }
        return -1;
    }
}