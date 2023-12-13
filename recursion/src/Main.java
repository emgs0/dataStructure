/**
 The Main class provides examples of recursion in Java.
 * Recursion is a programming concept where a function calls itself,
 * and it is used to solve problems by dividing them into sub-problems of
 * the same type as the original.
 * Recursive methods can be a substitute for iteration and are commonly employed in
 * advanced sorting algorithms and navigating tree structures.
 * Advantages:
 *      easier to read/write
 *      easy to debug
 * Disadvantages:
 *      sometimes slower
 *      use more memory.
 */
public class Main {
    /**
     * The main method demonstrates recursion by calling the 'walk' method with an initial number of steps.
     *
     * @param args The command-line arguments (unused in this program).
     */
    public static void main(String[] args) {
        walk(50);
    }
    /*
    This is the iterative example to compare with recursion
    public static void walk(int steps){
        for(int i =0; i<steps; i++){
            System.out.println("step: "+i);
        }
    }
     */
    public static void walk(int steps){
        // Base case: stop recursion when no more steps are needed
        if(steps<1) return;

        // Display the current step and recursively call 'walk' for the remaining steps
        System.out.println("you take a step "+steps); //I add the number of step to see that its a LIFO stack
        walk(steps-1);
    }
}