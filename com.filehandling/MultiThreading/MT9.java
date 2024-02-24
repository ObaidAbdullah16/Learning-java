// Dead Lock...
package MultiThreading;

class Library implements Runnable{

    String res1 = new String("Java");
    String res2 = new String("Python");
    String res3 = new String("C#");

    public void run(){

        String name = Thread.currentThread().getName();

        if(name.equals("Student1")){

            try{

                Thread.sleep(3000);
                synchronized(res1){
                    
                    System.out.println("Student1 has aquired res1 : " + res1);
                    Thread.sleep(3000);
                    synchronized(res2){

                        System.out.println("Student1 has aquired res2 : " + res2);
                        Thread.sleep(3000);
                        synchronized(res3){

                            System.out.println("Student1 has aquired res3 : " + res3);
                            Thread.sleep(3000);
                        }
                    }
                }
            }
            catch(Exception e){
                
                System.out.println("An unexpected error occured...");
            }
        }

        else{

            try{

                Thread.sleep(3000);
                synchronized(res3){
                    
                    System.out.println("Student2 has aquired res3 : " + res3);
                    Thread.sleep(3000);
                    synchronized(res2){

                        System.out.println("Student2 has aquired res2 : " + res2);
                        Thread.sleep(3000);
                        synchronized(res1){

                            System.out.println("Student2 has aquired res1 : " + res1);
                            Thread.sleep(3000);
                        }
                    }
                }
            }
            catch(Exception e){
                
                System.out.println("An unexpected error occured...");
            }
        }
    }
}

public class MT9 {
    public static void main(String[] args) {
        
        Library lb = new Library();

        Thread td1 = new Thread(lb);
        Thread td2 = new Thread(lb);  
        
        td1.setName("Student1");
        td2.setName("Student2");

        td1.start();
        td2.start();
        
    }

}
