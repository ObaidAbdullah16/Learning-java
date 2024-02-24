package DSA.API.API;

enum Result{

    PASS, FAIL, NR;

    int marks;

    Result(){

        System.out.println("This is a constructor in enum!!");
    }

    public void setMarks(int marks){
        this.marks = marks;
    }
    public int getMarks(){
        return marks;
    }
}

public class API6 {
    public static void main(String[] args) {
        
        Result.PASS.setMarks(95);
        int m = Result.PASS.getMarks();
        System.out.println(m);

        int m1 = Result.FAIL.getMarks();
        System.out.println(m1); // output : 0 , because marks is not set for FAIL;

        
    }
}
