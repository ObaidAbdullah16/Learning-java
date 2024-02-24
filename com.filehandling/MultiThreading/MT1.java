// Understanding Thread in java...

package MultiThreading;
import java.util.Scanner;

public class MT1 {
    public static void main(String[] args) {
        
        System.out.println("\n");
        
        System.out.println("Calculation Task Started...");
        
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter a number : ");
        int num = sc.nextInt();
        System.out.println(num);
        
        
        System.out.println("Calculation Task Ended");

        

        System.out.println(".....................................................................");

        
        
        System.out.println("Printing Task Started...");
        
        
        for(int i= 0; i<=5; i++){
            System.out.println("*");
        }
        
        
        System.out.println("Printing Task Ended");


        
        System.out.println(".....................................................................");

        
        
        System.out.println("Displaying Task Started...");


        for(int i= 0; i<=5; i++){
            System.out.println("This is an important task!!!");
        }


        System.out.println("Displaying Task Ended");

        
        System.out.println("\n");

        
    }
}
