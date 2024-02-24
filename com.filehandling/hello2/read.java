package hello2;
import java.io.*;

public class read {
    public static void main(String args[]) throws Exception{
        
        File dir = new File("hello");
        File file = new File(dir, "PW.txt");

        FileReader fr = new FileReader(file);

        // int index = fr.read();

        // System.out.println((char)index);

        // while(index != -1){

        //     System.out.print(index + "-------->");
        //     System.out.println((char)index);
        //     index = fr.read();
        // }

        char ch[] = new char[(int)file.length()];
        
        fr.read(ch);
        for(char d : ch){
            System.out.print(d);
        }
    }
}
