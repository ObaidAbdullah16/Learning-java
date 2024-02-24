// program to reverse the digits of a nubmer...

import java.util.Scanner;
import java.lang.Math;

class Reverse{

    Scanner scan = new Scanner(System.in);
    
    // 1692 -> 2961
    public int revDigitGen(){
    
        System.out.print("Enter a number to be reversed : ");
        int num = scan.nextInt();
        int revNum = 0;

        while(num!=0){

            int remainder = num%10;
            revNum = revNum*10 + remainder;
            num /= 10;
        }
        scan.close();
        System.out.println("Using standard approch ....");
        return revNum;
        
    }

    public StringBuilder revDigitStrBuild(){

        System.out.print("Enter a number to be reversed : ");
        int num = scan.nextInt();
        StringBuilder sb = new StringBuilder(String.valueOf(num));
        StringBuilder reverse = sb.reverse();
        
        return reverse;
    }

    // check for armstrong number
    // if 153 == 1^3 + 5^3 + 3^3 then the number is armstrong number...
    public boolean armstrongNo(){

        System.out.print("Enter a number to check for armstrong number : ");
        int input = scan.nextInt();
        int num = input;
        double armstrongNumber = 0;
        String lengthOfNumber = (String.valueOf(num));
        int length = lengthOfNumber.length();

        while(num!=0){

            int digit = num%10;
            armstrongNumber = Math.pow(digit, length) + armstrongNumber;
            num /= 10;

        }
        scan.close();
        if(armstrongNumber == input)
        return true;
        else 
        return false;

    }

    // check for palindrome number....
    public boolean palindrome(){

        System.out.print("Enter a number to check for palindrome : ");
        int input = scan.nextInt();
        int num = input;
        int revNum = 0;

        while(num!=0){

            int remainder = num%10;
            revNum = revNum*10 + remainder;
            num /= 10;
        }
        scan.close();

        if(revNum == input)
        return true;
        else
        return false;

    }

}

public class RevDigits {
    public static void main(String[] args) {
        
        Reverse r1 = new Reverse();

        // System.out.println(r1.revDigitStrBuild());
        // System.out.println(r1.revDigitGen());

        // float result = (float)10/3;
        // System.out.println(result);

        // System.out.println(r1.armstrongNo());
        System.out.println(r1.palindrome());
    }
}
