class A{
  public void show(){
    System.out.println("in show A");
  }
}

class B extends A {

  //show method is overriden by B
  public void show(){
    System.out.println("in show B");
  }
}

public class MethodOverriding {
  public static void main(String[] args) {
    
    B obj = new B();
    obj.show();
  }
  
}
