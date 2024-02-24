import java.io.*;

public class practise {
    public static void main(String[]args) throws Exception{
        
        // File f1 = new File("Obaid.txt");
        // System.out.println(f1.exists());

        // f1.createNewFile();
        // System.out.println(f1.exists());

        // File dic = new File("hello");
        // System.out.println(dic.exists());

        // dic.mkdir();
        // System.out.println(dic.exists());

        // File dir1 = new File("hello2");
        // System.out.println(dir1.isDirectory());
        // dir1.mkdir();
        // System.out.println("dir1 is reffering to directory hello2 : " + dir1.isDirectory());

        // File f2 = new File(dir1, "obaid2");
         // System.out.println(f2.isFile());
        // f2.createNewFile();
        // System.out.println("f2 is reffering to file obaid2 in dir1 : " + f2.isFile());


        int count = 0;

        File file = new File("hello2");
        // System.out.println(file.list());

        String s1[] = file.list();

        for(String a : s1){
           
           count++;
           System.out.println(a);
        }
        System.out.println(count);


    }

  
    
}
