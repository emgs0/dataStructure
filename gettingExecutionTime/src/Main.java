/**
 * The {@code Main} class is a simple Java program that measures the time taken to execute a specific section of code.
 * It utilizes the System.nanoTime() method to record the start time, executes a program, and then calculates
 * the duration of the program's execution in milliseconds.
 * <p>
 * The program includes a sleep statement to simulate an operation that takes time to complete.
 * </p>
 * <p>
 * The main method prints "Hello world!" after a delay of 3000 milliseconds using Thread.sleep(),
 * and then outputs the duration of the entire program execution in milliseconds.
 * </p>
 * <p>
 * Note: The timing precision may vary depending on the system and the underlying hardware.
 * </p>
 *
 * @throws InterruptedException If any thread has interrupted the current thread.
 */
public class Main {
    /**
     * The entry point of the program.
     *
     * @param args The command-line arguments (unused).
     * @throws InterruptedException If any thread has interrupted the current thread.
     */
    public static void main(String[] args) throws InterruptedException {
        long start = System.nanoTime();

        // ------Generic program start-------------
        Thread.sleep(3000);
        System.out.println("Hello world!");
        // -------------------------------

        long duration = (System.nanoTime() - start) / 1000000;
        System.out.println(duration + "ms");
    }
}
