//This is an abstract class
abstract class Car{
  public abstract void drive();
}

//When a class extends abstract class, it must implement all the abstract methods in the parent class
class WagonR extends Car{
  public void drive(){
    System.out.println("Driving");
  }
}

public class AbstractClass {
  public static void main(String[] args) {
    WagonR obj1 = new WagonR();
    obj1.drive(); 
  } 
}