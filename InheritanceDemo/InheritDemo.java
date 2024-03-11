package InheritanceDemo;

public class InheritDemo {
  
  public static void main(String[] args) {
    
    SciCalc obj = new SciCalc();
    int r1 = obj.add(3,2);
    int r2 = obj.subtract(6, 4);
    int r3 = obj.multi(3,2);
    int r4 = obj.div(10,2);

    System.out.println(r1+" "+r2+" "+r3+" "+r4);

  }
}
