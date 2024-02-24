package DSA.API.API;
import java.lang.annotation.*;


@Target({ElementType.TYPE, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@interface CricketPlayer{

    String country() default "India";
    int age() default 18;

}

@CricketPlayer(age = 21)
class Virat{
    // @CricketPlayer / error will come since the annotation is targeted for class type 
    private int innings;
    private int runs;

    @CricketPlayer(country = "china", age = 17)
    void setInnings(int innings){

        this.innings = innings;
    }
    void setRuns(int runs){

        this.runs = runs;
    }

    int getInnings(){
        return innings;
    }
    int getRuns(){
        return runs;
    }

}

public class API9 {
    public static void main(String[] args) {
        
        Virat v = new Virat();
        v.setInnings(500);
        v.setRuns(10000);

        int i = v.getInnings();
        int r = v.getRuns();
        System.out.println(i);
        System.out.println(r);

        Class c = v.getClass();
        Annotation a = c.getAnnotation(CricketPlayer.class);
        CricketPlayer cp = (CricketPlayer)a;
        System.out.println(c);
        System.out.println(cp);

        int ag = cp.age();
        String ct = cp.country();

        // System.out.println("country : " + ct + "    |     age : " + ag);
    }
}
