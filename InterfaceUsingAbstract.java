
// Interfaces are a crucial feature in Java that supports multiple inheritance, abstraction, contract enforcement, code decoupling, polymorphism
// Here we have seen why do we need interface, we are using abstract class to implement interface
abstract class Computer{
  public abstract void code();
}

class Laptop extends Computer{
  public void code(){
      System.out.println("Coding in Laptop");
  }
}

class Desktop extends Computer{
  public void code(){
      System.out.println("Coding in Desktop");
  }
}

public class InterfaceUsingAbstract {
  public static void main(String[] args) {
    Laptop l1 = new Laptop();
    Desktop d1 = new Desktop();
    l1.code();
    d1.code();
  }
}
