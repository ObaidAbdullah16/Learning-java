// switch case-enum......

package DSA.API.API;

enum Result1{
    PASS, FAIL, NR;
}

public class API7 {
    public static void main(String[] args) {
        
        Result1 res = Result1.PASS;

        switch(res)
        {
            case FAIL : System.out.println("You are failed in 1st semester exam !!");
            break;
            case PASS : System.out.println("You have passed the 1st semester examination !!!");
            break;
            case NR : System.out.println("Your result has not been generated yet !!!");
            default : System.out.println("Fuck off !!!");
        }
    }
}
