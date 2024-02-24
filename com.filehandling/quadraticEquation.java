// Program for solving quadratic equations....
import java.util.*;

public class quadraticEquation {
    public static void main(String []args){

        System.out.println("This is a program to calculate the roots of ");
        System.out.println();
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the coefficient of x^2(a) : ");
        int a = scan.nextInt();
        System.out.println();
        System.out.print("Enter the coefficent of x(b) : ");
        int b = scan.nextInt();
        System.out.println();
        System.out.print("Enter the constant c : ");
        int c = scan.nextInt();
        System.out.println();
        scan.close();

        int D = (b*b) - (4*a*c);

        double root1 = 0;
        double root2 = 0;
        
        if(D<0){
            System.out.println("Sorry, But No real roots exist");
            System.out.println("Discreminent D = " + D);
        }
        else if(D==0){
            root1 = (-b + java.lang.Math.pow(D, 0.5))/(2*a);
            root2 = (-b - java.lang.Math.pow(D, 0.5))/(2*a);

            System.out.println("Discreminent D = " + D);
            System.out.println("Two equal real roots :-");
            System.out.println("Root 1 : " + root1);
            System.out.println("Root 2 : " + root2);
        }
        else{
            root1 = (-b + java.lang.Math.pow(D, 0.5))/(2*a);
            root2 = (-b - java.lang.Math.pow(D, 0.5))/(2*a);

            System.out.println("Discreminent D = " + D);
            System.out.println("Two distinct real roots :-");
            System.out.println("Root 1 : " + root1);
            System.out.println("Root 2 : " + root2);
        }

        
    }
}
