//It is also called SAM (Simple abstract method)
@FunctionalInterface
interface Bottle{
  void color(String color);
}

// Marker interface do not have any functions
@FunctionalInterface
interface Calculate{
  int add(int i, int j);
}
public class Lambda {
    
  public static void main(String[] args) {

    //Anonymous class
    Bottle obj = new Bottle() {
      public void color(String color){
          System.out.println("Purple");
      }
    };
    obj.color("Blue");

    //Lambda function representation
    Bottle obj1 = (color) -> {
      System.out.println("in show");
    };
    obj1.color("Blue");

    Calculate cal = (i,j) -> {
      return i+j;
    };

    // Calculate cal = new Calculate(){
    //     public int add(int i,int j){
    //         return i+j;
    //     }
    // };
    int result = cal.add(2,3);
    System.out.println(result);
  }
}
