import java.io.*;

class Hell implements Serializable{
    
    private String name;
    transient private int age;  // selective serialization
    private int runs; 

    public Hell(String name, int age, int runs){

        this.name = name;
        this.age = age;
        this.runs = runs;
    }

    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public int getRuns(){
        return runs;
    }

    public void display(){
        System.out.println(name);
        System.out.println(age);
        System.out.println(runs);
    }

    private static final long serialVersionUID = 1653407060909681913L;
}

public class serianddeseri {
    public static void main(String[] args) throws Exception{
        
        // Hell c = new Hell("virat", 35, 15000);
        // c.display();

        // System.out.println(c.getAge());

        // FileOutputStream fos = new FileOutputStream("C:\\Users\\obaid\\OneDrive\\Desktop\\java practise\\com.filehandling\\hello\\PW.txt");
        // BufferedOutputStream bos = new BufferedOutputStream(fos);
        // ObjectOutputStream oos = new ObjectOutputStream(bos);

        // oos.writeObject(c);
        // oos.flush();
        // oos.close();

        FileInputStream fis = new FileInputStream("PW.txt");
        BufferedInputStream bis = new BufferedInputStream(fis);
        ObjectInputStream ois = new ObjectInputStream(bis);

        Hell cr = (Hell)ois.readObject();
        cr.display();
        ois.close();

    }
}
