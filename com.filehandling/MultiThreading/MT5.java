// METHOD 2 :- BY implementing runnable interface...

package MultiThreading;
import java.util.*;


class Thread1 implements Runnable{

    public void run(){

        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter a number : ");
        int num = sc.nextInt();
        System.out.println(num);
        System.out.println(".....................................................................");
    }
   
}

class Thread2 implements Runnable{

    public void run(){

        try{
        for(int i= 0; i<=5; i++){
            System.out.println("*");
            Thread.sleep(3000); // stops the program for given time period(in mili seconds)
        }
        }
        catch(Exception e){
            System.out.println("exception!!!");
        }
        System.out.println(".....................................................................");
    }
}


public class MT5 {
    public static void main(String[] args) {
        
        // Thread1 t1 = new Thread1();
        // Thread2 t2 = new Thread2();

        Thread tt1 = new Thread(new Thread1());
        Thread tt2 = new Thread(new Thread2());

        tt1.start();
        tt2.start();

        
        
        
        
        // TIME PASS...........................................
        
        // try(Scanner scan = new Scanner(System.in);){
        
        // System.out.print("Enter number 1 : ");
        // int a = scan.nextInt();
        // System.out.print("Enter number 2 : ");
        // int b = scan.nextInt();
        // int result = a + b;
        // System.out.println("Sum is equal to : " + result);

        // }

        // catch(Exception e){

        //     System.out.println(e.getMessage());
        // }



          
    }
}
