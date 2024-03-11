class Mobile{
  String brand;
  int price;
  static String name = "Smartphone";

  public void show(){
    System.out.println(brand+ " : "+name+" : "+price);
  }

  public static void display(Mobile obj){
    System.out.println(obj.brand+ " : "+name+" : "+obj.price);
  }
}

public class Static {
  public static void main(String[] args) {
    
    Mobile obj1 = new Mobile();
    obj1.brand = "Apple";
    obj1.price = 1500;
    // Mobile.name = "Smartphone";

    Mobile obj2 = new Mobile();
    obj2.brand = "Samsung";
    obj2.price = 1200;
    // Mobile.name = "Smartphone";

    obj1.show();
    obj2.show();

    Mobile.display(obj2);
  }
  
}
