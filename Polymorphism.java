// Polymorphism...

class Aeroplane {
    void takeOff() {
        System.out.println("Plane is taking off!!");
    }

    void fly() {
        System.out.println("Plane is flying!!");
    }

    void type() {
        System.out.println("Platunum Plane!!");
    }
}

class CargoPlane extends Aeroplane {

    void fly() {
        System.out.println("Plane is flying cargo!!");
    }

    void type() {
        System.out.println("Metal Plane!!");
    }
}

class PassengerPlane extends Aeroplane {
    void fly() {
        System.out.println("Plane is flying Passengers!!");
    }

    void type() {
        System.out.println("golden Plane!!");
    }
}

class FighterPlane extends Aeroplane {
    void fly() {
        System.out.println("Plane is flying fighters and ammonation!!");
    }

    void type() {
        System.out.println("Black Stainless Steel Plane!!");
    }
}

class Airport // Runtime Plymorphism...
{
    void poly(Aeroplane aero) {
        aero.fly();
        aero.type();

        System.out.println("-----------------------------------------------------------------");
    }
}

class Polymorphism {
    public static void main(String[] args) {

        CargoPlane cp = new CargoPlane();

        PassengerPlane pp = new PassengerPlane();

        FighterPlane fp = new FighterPlane();

        Airport air = new Airport();
        air.poly(cp);
        air.poly(pp);
        air.poly(fp);

        // cp = pp; (error: since both belongs to a different class )

        // Aeroplane air;
        // air = pp; // (air can hold pp since air is the parent class of pp)
        // cp = air; // (error: child class can't hold parent class)

        // Polymorphism - same air in two forms...

        // air.fly();
        // air.type();
        // air = cp;
        // air.fly();
        // air.type();

    }
}