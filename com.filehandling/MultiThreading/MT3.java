// METHOD 1 :- Creating new thread by extending thread class...

package MultiThreading;

class MyThread extends Thread{

    public void run(){
        System.out.println("This is a child Thread !!!");
    }
}

public class MT3 {
    public static void main(String[] args){

        System.out.println("Main Thread");

        MyThread mt = new MyThread();
        mt.start();
        mt.currentThread().setPriority(10);
        // Thread.currentThread().setPriority(1);
        System.out.println(MyThread.currentThread().getPriority());
        System.out.println(Thread.currentThread().getPriority());
    }
}
