// join() and isAlive() methods...
package MultiThreading;

class MyThread1 implements Runnable {

    public void run(){

        try{
        for(int i= 0; i<=4; i++){
            System.out.println("*");
            Thread.sleep(2000); // stops the program for given time period(in mili seconds)
        }
        }
        catch(Exception e){
            System.out.println("exception!!!");
        }
        System.out.println(".....................................................................");
    }
}

public class MT7 {
    public static void main (String[] args) throws Exception {
        
        System.out.println("Main Thread started the work...");
        
        MyThread1 mt = new MyThread1();

        Thread tttt = new Thread(mt);
        System.out.println(tttt.isAlive());
        tttt.start();
        System.out.println(tttt.isAlive());
        tttt.join();

        System.out.println("Main Thread finished the work...");
    }
}
