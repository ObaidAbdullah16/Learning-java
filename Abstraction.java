abstract class Aeroplane
{
    void takeOff()
    {
        System.out.println("Plane is taking off!!");
    }
    abstract void fly();
   
    abstract void type(); 
   
}

class CargoPlane extends Aeroplane
{
   
   void fly() 
   {
    System.out.println("Plane is flying cargo!!");
   }
   void type() 
   {
    System.out.println("Metal Plane!!"); 
   }
   void alert()
   {
    System.out.println("Alert crash!!!");
   }
}

class PassengerPlane extends Aeroplane
{
    void fly() 
    {
     System.out.println("Plane is flying Passengers!!");
    }
    void type() 
   {
    System.out.println("golden Plane!!"); 
   }
}

public class Abstraction {
    public static void main(String []args)
    {
        Aeroplane cp = new CargoPlane();
        cp.fly();
        cp.type();
        cp.takeOff();
        // cp.alert(); 
        // (error: cannot call specialised method in cp since its refernce is Aeroplane)
        ((CargoPlane)cp).alert(); // Solution
        // down casting - to use a specialised method in cp we make it temporarily of cp class

        Aeroplane pp = new PassengerPlane();
        pp.fly();
        pp.type();
        pp.takeOff();

        // Aeroplane ap = new Aeroplane(); //(error: we cannot create object of an abstract class)
    }   
}
