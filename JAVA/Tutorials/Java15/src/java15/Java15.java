
package java15;
import java.util.*;
public class Java15 {

    public static void main(String[] args) {
        PriorityQueue<String> q = new PriorityQueue<>();
        q.offer("first");
        log(q);
        q.offer("second");
        log(q);
        q.offer("third");
        log(q);
        
        //print object with the highest priority
        System.out.printf("Highest Priority: %s",q.peek());
        System.out.println();
        
        q.poll();
        log(q);
        
    }
    
    private static void log(PriorityQueue p)
    {
        if(p.isEmpty())
            System.out.println("You have nothing else in your stack");
        else
            System.out.printf("%s <-\n",p);
    }
}
