package hello2;
import java.io.*;

public class Breader {
    public static void main(String[] args) throws Exception{
        
        File dir = new File("hello2");
        File file = new File(dir, "obaid2");

        FileReader fr = new FileReader(file);
        BufferedReader br = new BufferedReader(fr);

        String line = br.readLine();

        while(line != null){

            System.out.println(line);
            line = br.readLine();
        }
        br.close();

    }
}
