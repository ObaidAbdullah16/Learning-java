// Inheritance

// class Human // Parent/Super class...(extends object)
// {
//     int age;
//     private String name;

//     Human()
//     {
//         System.out.println("This is a constructor");
//     }
    
//     void sleep()
//     {
//         age = 19;
//         System.out.println("Humans are the worst creatures!!");
//         System.out.println(age);
//     }
// }


// class Teacher extends Human // Child/Sub class...
// {
//    int experience;

//    void teach()
//    {
//        experience = 23;
//        System.out.println("You are an experienced teacher!!");
//        System.out.println(experience);
//    }
// }


// class Student extends Teacher // Child/Sub class...
// {
//    void display()
//    {
//       System.out.println("Your age is : " + age);
//     //   System.out.println("Your name is : " + name); // private members are not inherited...
    
//    }
// }
 

// class Joker //extends object (by default)
//  {
//     int jok;
//     void disp()
//     {
//         System.out.println(jok);
//     }
//  }  

//_____________________________________________________________________________________________

class Aeroplane
{
    void takeOff()
    {
        System.out.println("Plane is taking off!!");
    }
    void fly()
    {
        System.out.println("Plane is flying!!");
    }
}

class CargoPlane extends Aeroplane
{
//    void takeOff()   // Inherited method
//    {
//     System.out.println("Plane is taking off!!");
//    }
   
    void fly() // Overhidden method
   {
    System.out.println("Plane is flying cargo!!");
   }
   void type() // Specialized method
   {
    System.out.println("Metal Plane!!"); 
   }
}

class PassengerPlane extends Aeroplane
{
    void fly() // Overhidden method
    {
     System.out.println("Plane is flying Passengers!!");
    }
}

 class Inheritance1
{
    public static void main(String []args)
    {
    //    Student st = new Student();
    //    st.sleep();
    //    st.teach();
    //    st.display();

    CargoPlane cp = new CargoPlane();
    cp.fly();
    cp.takeOff();

    PassengerPlane pp = new PassengerPlane();
    pp.fly();
    pp.takeOff();
       
    }
}