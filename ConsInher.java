// Constructor execution in case of Inheritance...

class Demo1 {
  int a, b;

  Demo1() {
    System.out.println("Parent class constructor");
  }

  Demo1(int x, int y) {
    System.out.println("parameters Parent class constructor");
    a = x;
    b = y;
  }
}

class Demo2 extends Demo1 {
  int m, n;

  Demo2() {
    this(34, 67);
    // super(12,34);// this will call parameters parent class constructor

    // super(); // even if you don't write super it will be called by default
    System.out.println("child class constructor");
  }

  Demo2(int x, int y) {
    super(16,38);
    System.out.println("parameters child class constructor");
    m = x;
    n = y;
  }

}

public class ConsInher {
  public static void main(String[] args) {
    // Demo2 d1 = new Demo2();
    // Demo2 d2 = new Demo2();

    Demo2 d3 = new Demo2(34, 19); // even if you have given parameters it will
    // still call the parent constructor without parameters
  }
}
