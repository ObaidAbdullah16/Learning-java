// getting and setting thread name and priority...

package MultiThreading;

public class MT2 {
    public static void main(String[] args) {
        
        System.out.println("______________________________Main Thread____________________________________________");
        System.out.println("..............................................................................");
        System.out.println("\n");
        System.out.println("Name and Priority before changing : ");
        System.out.println("\n");
        System.out.println("Main Thread Name : "+ Thread.currentThread().getName());
        System.out.println("Main Thread Priority : "+Thread.currentThread().getPriority());
        System.out.println("\n");
        System.out.println("Name and Priority after changing : ");
        System.out.println("\n");
        Thread t = Thread.currentThread();
        t.setName("Obaid");
        t.setPriority(2);

        // OR

        // Thread.currentThread().setName("hell");
        // Thread.currentThread().setPriority(9);

        System.out.println("Main Thread Name : "+ Thread.currentThread().getName());
        System.out.println("Main Thread Priority : "+Thread.currentThread().getPriority());
        System.out.println("\n");
        

    }
}
