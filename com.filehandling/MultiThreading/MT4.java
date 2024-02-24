// More on METHOD 1...

package MultiThreading;
import java.util.Scanner;

class Thread1 extends Thread{

    public void run(){

        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter a number : ");
        int num = sc.nextInt();
        System.out.println(num);
        System.out.println(".....................................................................");
    }

    
}

class Thread2 extends Thread{

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

public class MT4 {
    public static void main(String[] args) {
        
        System.out.println("Main Method");

        Thread1 t1 = new Thread1();
        Thread2 t2 = new Thread2();

        t1.start();
        t2.start();

        t1.setName("obaid");
        t1.setPriority(10);
        Thread.currentThread().setName("hell");
        // System.out.println(t1.getName());
        // System.out.println(t2.getName());
        // System.out.println(Thread.currentThread().getName());

    }
}
