// "final" keyword...

// final class Animal (error: final class cannot be inherited)
// {

// }
class Animal
{
    final int animalAge = 10;
    final void sleep()
    {
        // animalAge = 34;  // (error: cannot change the final variable)
        System.out.println("Animals Sleeps");
    }
}

final class Tiger extends Animal
{
    // final void sleep() //(error: cannot override a final method)
    // {

    // }
}

public class FinalC {
    public static void main(String []args)
    {
      Tiger t = new Tiger();
      t.sleep();
    }
}
