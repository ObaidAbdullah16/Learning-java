import java.util.*;

class Student{
    private int age;
    private String name;
    private String city;

    public Student(int age, String name, String city){
        this.age = age;
        this.name = name;
        this.city = city;
    }

    public String toString(){
        return " "+ name + " |" + age + " |" + city + " |";
    }
} 

public class IO {
    public static void main(String[] args) {
        Student s1 = new Student(38, "Ronaldo", "Riyadh");
        System.out.println(s1);

        Student s2 = new Student(36, "Messi", "Miami");
        System.out.println(s2);
    }
}
