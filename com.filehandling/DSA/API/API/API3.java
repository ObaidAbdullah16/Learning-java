package DSA.API.API;
import java.util.*;
import java.util.function.Consumer;

public class API3{
    public static void main(String[] args){

        List<Integer> list1 = new ArrayList<>();

        list1.add(1);
        list1.add(2);
        list1.add(5);
        list1.add(9);
        list1.add(7);
        list1.add(8);
        // System.out.println(list1);

        List<Integer> list2 = Arrays.asList(1, 2, 5, 9, 7, 8);
        // System.out.println(list2);

        // for(int i : list2){
        //     System.out.println(i);
        // }

        Consumer<Integer> cons = i->System.out.println(i);
        list2.forEach(cons);

        // list2.forEach(i-> System.out.println(i));

    }
}