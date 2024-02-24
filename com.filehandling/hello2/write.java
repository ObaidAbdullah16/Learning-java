package hello2;
import java.io.*;

public class write {
    public static void main(String[] args) throws Exception{
        File dir = new File("hello");

        File file = new File(dir, "PW.txt");
        // file.createNewFile();

        FileWriter fl = new FileWriter(file, true);

        fl.write("Assalamualaikum");
        fl.write("\n");
        fl.write(69);
        fl.write("\n");
        fl.write(54);
        fl.write("\n");
        fl.write("mummy");
        fl.write("\n");
        char ch[] = {'A', 'b', 'd', 'u', 'l', 'l', 'a', 'h'};
        fl.write(ch);
        fl.write("\n");

        fl.close();

        System.out.println("Open PW.txt to see results !!");

        File dir2 = new File("hello2");
        File file2 = new File(dir2, "obaid2");

        FileWriter fd = new FileWriter(file2);
        fd.write("Obaid is great");
        fd.write("\n");
        fd.write("FUck Off!");
        fd.write("\n");
        fd.write(21);
        fd.write("\n");

        fd.close();
    }
}
