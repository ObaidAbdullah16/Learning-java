// Encapsulation, Constructor and static keywords in java

class Student
{
    private String name;
    private int age;

    Student()
    {
        //this("fuck");            // for jumping to other constructors
        System.out.println("Error : no parameters inserted");
    }
    Student(String name, int age)
    {
       
       this.name = name;
       this.age = age;
       //System.out.println("Player name : " + name + ";  Player age : " + age);
    }
    Student(String name)
    {
        //this("off!", 69);         // for jumping to other constructors
        this.name = name;
        System.out.println("The greatest footballer ever born in this world : " + name);
    }
    Student(int age)
    {
        this.age = age;
        if(age>=16 && age<=30)
        {
            System.out.println("Don't go to Saudi :      " + age);
        }
        else
        {
            System.out.println("Yout may go to Saudi :      " + age);
        }
    }
    Student(double age)
    {
        System.out.println("Bhenchod age kya point me dega lodu tameez se de age : " + age);
    }
    
    void display()
    {
        System.out.println("Player name : " + name + ";  Player age : " + age);
        
    }
    
    // Setter and Getter:
    
    // public String getName() {
    //     return name;
    // }

    // public void setName(String name) {
    //     this.name = name;
    // }

    // public int getAge() {
    //     return age;
    // }

    // public void setAge(int age) {
    //     this.age = age;
    // }

    // public void show()
    // {
    //     System.out.println(name + " " + age);
    // }
}

class Mark {
    public static void main(String[] args) {
        
        // Student obj = new Student("Haaland", 21);
        // obj.display();

        // Student obj3 = new Student("Cristiano Ronaldo");
        // Student obj4 = new Student(35);
        // obj3.display();
        // Student obj5 = new Student(34.4);
        
        
        // obj.setName("Ronaldo");
        // obj.setAge(38);
        // obj.show();
        // System.out.println(obj.getName());
        // System.out.println(obj.getAge());

        // Student obj1 = new Student();
        // obj1.setName("Messie");
        // obj1.setAge(36);
        // obj1.show();
        // System.out.println(obj1.getName());
        // System.out.println(obj1.getAge());

        
        
    }
}
