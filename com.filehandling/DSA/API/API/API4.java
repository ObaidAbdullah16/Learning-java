// Stream API.........

package DSA.API.API;
import java.util.*;
import java.util.function.Predicate;
import java.util.stream.*;

public class API4 {
    public static void main(String[] args) {
       
        List<Integer> list = Arrays.asList(1,3,7,6,9,5);
        Stream<Integer> streamData1 = list.stream();

        int count = (int)streamData1.count();
        // System.out.println("Count is : " + count);

        Stream<Integer> streamData2 = list.stream();
        
        // streamData2.forEach(a->System.out.println(a));

        // streamData2.forEach(a->System.out.println(a));

        Stream<Integer> streamData3 = list.stream();

        Stream<Integer> sortedStream = streamData3.sorted();
        // streamData3.forEach(a->System.out.println(a));

        Stream<Integer> mappedStream = sortedStream.map(n->(2*n));
        // mappedStream.forEach(a->System.out.println(a));

        Stream<Integer> streamData4 = list.stream(); 
        Stream<Integer> streamData5 = streamData4; 
        
        // streamData4.forEach(a->System.out.println("Fuck : " + a));

        // Method 1........................
        Stream<Integer> filteredStream = streamData5.filter(a->a%2==0);

        // METHOD CHAINING:................
        // Stream<Integer> finalStream = streamData5.filter(n->n%2 == 0).sorted().map(n->n*3);

        // Method 2........................
        // Using annonymous inner class:..................
        /*Implementing Predicate interface 
         * using annonymous inner class to write the logic
         */
        // Predicate<Integer> pre = new Predicate<Integer>(){
        //     public boolean test(Integer i){
        //         if(i%2==0)
        //         return true;
        //         else
        //         return false;
        //     }
        // };

               // OR
        
        // Method 3........................
        // Using lambda expression:............................
        // Predicate<Integer> pre1 = a->a%2 == 0;               

        // Stream<Integer> finalStream = streamData5.filter(pre).sorted().map(n->n*3);
           
        
        // Method 4........................
        /*Using separate class to implement Predicate interface
         * defining test method in this class 
         * creating object of this demo class 
         */
        
        // class Demo implements Predicate<Integer>{

        //     public boolean test(Integer i){
        //         if(i%2==0)
        //         return true;
        //         else
        //         return false;
        //     }

        // }

        // Demo d1 = new Demo();

        // Stream<Integer> filteredStream = streamData5.filter(d1);
    }

}
