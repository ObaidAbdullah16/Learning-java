import java.util.*;

public class patternpractise {
    public static void main(String[] args) {
        
        ArrayList al = new ArrayList();
        
        al.add(100);
        al.add(200);
        al.add(300);

        for(int i=0; i<al.size(); i++)
        {
            // System.out.println(al.get(i));

            // Object o = al.get(i);
            // System.out.println(o);
        }

        for(Object o : al)
        {
            System.out.println(o);
        }
        
        
        
        // for(int i = 0; i<5; i++){
            
        //     for(int j = 0; j<5; j++)
        //     {
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }

        // for(int i = 0; i<5; i++){
            
        //     for(int j = 0; j<=i; j++)
        //     {
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }

    //        int n = 8;
    
    //     for (int i = 0; i<n+1; i++)
    //  {
    //     for (int j=0; j<n+1; j++)
    //   {
        
    //      if (i==0||i==n||j==0||i==n/2)
    //     {
    //       System.out.print("* ");
    //     }
         
    //      else 
    //     {
    //       System.out.print("  ");

    //     }
    //   }
    //     System.out.println();
    //  } 

    // int n = 10;
    // for(int i = 0; i < n+1; i++)
    // {
    //     for(int j = 0; j < n+1; j++)
    //     {
    //         if(i == 0 && j<n/2 || i == n && j<n/2 || j == 0 || j == n/2 && i>0 && i<n)
    //         {
    //             System.out.print("* ");
    //         }
    //         else
    //         {
    //             System.out.print("  ");
    //         }
    //     }
    //     System.out.println();
    // }

    // int n=20;

    //   for (int i=0; i<n+1; i++)
    //   {
    //     for (int j=0; j<n+1; j++)
    //     {
    //        if (i==0 || j==0 || i+j<=n/2|| j==n || j-i>=n/2 || i==n || i-j>=n/2 || i+j>=n+n/2)
    //        {
    //         System.out.print("* ");
    //        }

    //        else 
    //        {
    //         System.out.print("  ");
    //        }
    //     }
    //     System.out.println();
    //       }

    
    }
}
