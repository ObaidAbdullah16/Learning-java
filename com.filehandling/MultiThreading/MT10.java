package MultiThreading;

class Example implements Runnable{

    public void run(){
        
        for(int i = 0; i<=4; i++){

            try{
            System.out.println("Fuck you all of IET E-cell !!!");
            Thread.sleep(4000);
            }
            catch(Exception e){
                System.out.println("Thread is being interrupted !!!");
            }
        }
        
    }
}

public class MT10 {
    public static void main(String[] args) {
        
        Example ex = new Example();
        Thread t1 = new Thread(ex);
        t1.start();
        t1.interrupt();   
    }
}
