
package java14;
import java.util.*;
public class Java14 {

    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        stack.push("bottom");
        log(stack);
        stack.push("Second");
        log(stack);
        stack.push("Third");
        log(stack);
        
        stack.pop();
        log(stack);
        stack.pop();
        log(stack);
        stack.pop();
        log(stack);
    }
    
    private static void log(Stack s)
    {
        if(s.isEmpty())
            System.out.println("You have nothing else in your stack");
        else
            System.out.printf("%s <-\n",s);
    }
}
