// ENUM.....................

package DSA.API.API;
import java.util.*;
import java.util.stream.*;

enum Week{
    MON, TUE, WED, THU, FRI, SAT, SUN
}

public class API5 {
    
    enum result{
        PASS, FAIL, NR
    }
    public static void main(String[] args) {
        
        // cannot create object of enum.....
        // Week w = new Week();

        Week w = Week.MON;
        // System.out.println(w);
        int index = w.ordinal();
        // System.out.println(index);

        Week wk[] = Week.values(); // creates an array
        
        int count = 0;
        for(Week r: wk){
            
            count++;
            System.out.println("Day " + count + " : " + r);
        }

        // result r = result.PASS;
        // System.out.println(r);

        System.out.println(wk);
    }
}
