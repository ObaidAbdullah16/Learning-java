package DSA.API.API;
import java.time.*;

public class API2 {
    public static void main(String[] args) {
        LocalDate Date = LocalDate.now();
        // System.out.println(Date);

        System.out.println(Date.getMonthValue());
        System.out.println(Date.getDayOfMonth());
        System.out.println(Date.getYear());

        LocalTime lt = LocalTime.now();
        // System.out.println(lt);

        System.out.println(lt.getHour());
        System.out.println(lt.getSecond());
        System.out.println(lt.getMinute());
        System.out.println(lt.getNano());
    }
}
