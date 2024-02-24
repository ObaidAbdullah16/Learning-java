// Synchronization...
package MultiThreading;
// we can use synchronized either on method or a block...

class Car implements Runnable{

    /*synchronized*/ public void run(){

        try{

            System.out.println(Thread.currentThread().getName() + " Has entered the parking lot...");
            Thread.sleep(2000);
            synchronized(this)
            {
            System.out.println(Thread.currentThread().getName() + " Got into the car to drive...");
            Thread.sleep(2000);
            System.out.println(Thread.currentThread().getName() + " Has started driving the car...");
            Thread.sleep(2000);
            System.out.println(Thread.currentThread().getName() + " Has left the parking lot...");
            Thread.sleep(2000);
            }

        }
        catch(Exception e){

            System.out.println("An unexpected problem occured !!!");

        }
    }
}

public class MT8 {
    public static void main(String[] args) {
        
        Car c = new Car();

        Thread tat1 = new Thread(c);
        Thread tat2 = new Thread(c);
        Thread tat3 = new Thread(c);

        tat1.setName("Ronaldo");
        tat2.setName("Messi");
        tat3.setName("Mo Salah");

        tat1.start();
        tat2.start();
        tat3.start();

    }
}
