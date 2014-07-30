
package java12;
import java.util.*;

public class Java12 {

    public static void main(String[] args) {
        String[] stuff = {"apples","beef","corn","ham"};
        List<String> list1 = Arrays.asList(stuff);
        
        ArrayList<String> list2 = new ArrayList<String>();
        list2.add("youtube");
        list2.add("google");
        list2.add("digg");
        
        for(String x: list2)
                System.out.printf("%s ",x);
        
        Collections.addAll(list2, stuff);
        System.out.println();
        
        for(String x: list2)
                System.out.printf("%s ",x);
        
        System.out.println(Collections.frequency(list2, "digg"));
        
        boolean tof = Collections.disjoint(list1, list2);
        System.out.println(tof);
        
        if(tof)
            System.out.println("These lists do not have anything in common");
        else
            System.out.println("These lists must have something in common!");
    }
}
