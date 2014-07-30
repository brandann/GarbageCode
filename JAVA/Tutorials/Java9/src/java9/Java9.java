
package java9;
import java.util.*;
public class Java9 {

    public static void main(String[] args) {
        
        String[] crap = {"apples","lemons","guess","bacon","youtube"};
        List<String> l1 = Arrays.asList(crap);
        System.out.printf("%s\n", l1);
        
        Collections.sort(l1);
        System.out.printf("%s\n", l1);
        
        Collections.sort(l1, Collections.reverseOrder());
        System.out.printf("%s\n", l1);
        
    }
}
