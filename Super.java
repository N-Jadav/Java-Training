//Super calls the constructor of the parent class

class A {
  public A(){
    super();
    System.out.println("in A");
  }

  public A(int a){
    super();
    System.out.println("in A int "+a);
  }
}


class B extends A{

  public B(){
    super(10);
    System.out.println("in B");
  }

  public B(int a){
    this();
    System.out.println("in B "+a);
  }
}

public class Super {
  public static void main(String[] args) {
    B obj = new B(2);
    System.out.println(obj);
  }
  
}
