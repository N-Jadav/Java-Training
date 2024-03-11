class Human{
  private int age = 11;
  private String name = "Neerali";
  public int getAge() {
    return age;
  }
  public void setAge(int age) {
    this.age = age;
  }
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }
  

  
}

public class GetterSetter {
  public static void main(String[] args) {

    Human obj = new Human();
    obj.setAge(24);
    System.err.println(obj.getName()+" : "+obj.getAge());

    
  }
  
}
