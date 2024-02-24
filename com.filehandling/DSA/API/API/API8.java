// ANNOTATION....

package DSA.API.API;

// Functional Interface
@FunctionalInterface
interface Demo{

    void start();
    // void age();
}

// This is parent class
@Deprecated
class Plane{

    public void planeFlies(){
        System.out.println("The plane flies...");
    }
}

// This is child/sub class
class CargoPlane extends Plane{

    // Overridding method from parent class
    @Override
    public void planeFlies(){
        System.out.println("The cargoplane flies...");
    }
}

public class API8 {
    public static void main(String[] args) {
        
        // This is object of child class
        Plane cp = new CargoPlane();

        cp.planeFlies();
    }
}
