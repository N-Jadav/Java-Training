class Human{
  private int age = 11;
  private String name = "Neerali";

  public int getAge(){
    return age;
  }

  public String getName(){
    return name;
  }

  public void setAge(int a){
    age = a;
  }
}

public class Encapsulation {
  public static void main(String[] args) {

    Human obj = new Human();
    obj.setAge(24);
    System.err.println(obj.getName()+" : "+obj.getAge());

    
  }
  
}
