package hello2;
import java.io.*;

public class Preader {
    public static void main(String[] args) throws Exception {
        
        File dir = new File("hello3");
        File file = new File(dir, "obaid4");

        file.createNewFile();

        FileWriter fw = new FileWriter(file);
        PrintWriter pw = new PrintWriter(fw);

        pw.println("obaid");
        pw.println(69);
        pw.println("java");
        pw.println(1.5);
        pw.println(true);

        pw.close();
    }
}
