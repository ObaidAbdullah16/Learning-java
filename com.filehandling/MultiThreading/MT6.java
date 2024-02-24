// program is right.... it is not running properly due to some technical vscode issues.....so don't panic!!!

package MultiThreading;
import java.util.*;

class Thread1 extends Thread{

    private static Scanner sc = new Scanner(System.in);

    public void run(){

        String tName = Thread.currentThread().getName();

        if(tName.equals("trane")){
            System.out.println("trane is running...");
            trane();
        }
        else{
            System.out.println("crane is running...");
            crane();
        }
        sc.close();
    }

    public void crane(){

        System.out.print("Please enter a number : ");
        int num = sc.nextInt();
        System.out.println(num);
        System.out.println(".....................................................................");
    }

    public void trane(){

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



public class MT6 {
    public static void main(String[] args) {

        Thread1 t1 = new Thread1();
        Thread1 t2 = new Thread1();

        t1.setName("crane");
        t2.setName("trane");

        t1.start();
        t2.start();


    }
}
