// Static Keyword

public class Cart {
    
    static int a;
    static int b;

    int c;
    int d;
    
    static  // static block :
    {
        a = 29;
        b = 45;
        System.out.println("Le chutiye main method, tujh se pehle print ho raha huin; " + 
         "addition of a and b : " + (a+b));
    }

           // non-static block :
    {
        c = 34;
        d = 69;
        System.out.println("THis is non-static block; addition of c and d : " + (c+d));
    
    }
    
     static void display1()
     {
        System.out.println("Value of a : " + a);
        System.out.println("Value of b : " + b);
     }

     void display2()
     {
        System.out.println("Value of c : " + c);
        System.out.println("Value of d : " + d);
     }

    public static void main(String []args)
    {
        System.out.println("This is the main method");

        Cart obj = new Cart();
        obj.display2();
        Cart.display1();

    }
}
