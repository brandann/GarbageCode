
package java8;
import java.util.*;
public class Java8 {

    public static void main(String[] args) {
        String[] stuff = {"babies","watermellon","melons","fudge"};
        LinkedList<String> thelist = new LinkedList<>(Arrays.asList(stuff));
        
        thelist.add("pumpkin");
        thelist.addFirst("firstthing");
        
        for(String x: thelist)
            System.out.printf("%s ",x);
        
        System.out.println();
        
        //convert back to array
        stuff = thelist.toArray(new String[thelist.size()]);
        
        for(String x: stuff)
            System.out.printf("%s ",x);
    }
}
