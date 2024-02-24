package DSA.API.API;

// import java.util.Date;
// import java.sql.Date;

public class API1 {
    public static void main(String []args){

        java.util.Date dt = new java.util.Date();
        // System.out.println(dt);
        // System.out.println(dt.getTime());

        long tim = dt.getTime();
        java.sql.Date dt1 = new java.sql.Date(dt.getTime());
        System.out.println(dt1);
    }
}
