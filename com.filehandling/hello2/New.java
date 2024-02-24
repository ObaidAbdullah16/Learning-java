package hello2;
import java.io.*;

public class New {
    public static void main(String[] args) throws Exception{
        
        File dir = new File("hello3");
        dir.mkdir();
        File file = new File(dir, "obaid3.txt");
        file.createNewFile();

        FileWriter fw = new FileWriter(file);
        BufferedWriter bw = new BufferedWriter(fw);

        bw.write("Obaid is great");
        bw.newLine();
        bw.write("Fuck you !!");
        bw.newLine();
        bw.write(65);
        bw.newLine();
        bw.write(new char[]{'a', 'b', 'c'});
        bw.newLine();

        bw.close();




    }
}
