import java.util.Stack;

/**
 * The main program it's an example about the data structure of stacks:
 * Stack it's a LIFO data structure (LAST IN FIRST OUT), it stores objets
 * into a sort of "vertical tower", it has two main actions: PUSH & POP
 * push(): to add to the top.
 * pop(): to remove from the top.
 * we can stack objets or variables, so it's a good structure
 * Stack have 5 methods:
 * push(item)
 * pop()
 * peek() just to look the top item but don't delete it from the stack
 * empty() return true or false
 * search(object)
 * _______________________________________________________________________
 * the uses of stacks are this:
 * undo/redo features in text editors
 * moving back/forward through browser history
 * backtracking algorithms (maze, fil directory)
 * calling functions (call stack)
 */
public class Main {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        stack.push("matrix");
        stack.push("LOTR");
        stack.push("SW");
        stack.push("django");

        //System.out.println(stack.empty());
        System.out.println(stack); //prints the whole stack as a vector
        String mymovie = stack.pop();// <- this gets the last movie (django) and remove it from the stack
        System.out.println(mymovie);
        System.out.println(stack);
        String mymovie2 = stack.peek(); //<- this gets the last movie without drop it from the stack
        System.out.println(mymovie2);
        System.out.println(stack);
        /*
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        */
    }
}