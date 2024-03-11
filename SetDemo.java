
import java.util.HashSet;
import java.util.Set;

// Set cannot have duplicate values
// Set do not have index value
// TreeSet stores value in sorted form

public class SetDemo {
  public static void main(String[] args) {
    Set<Integer> nums = new HashSet<Integer>();
    nums.add(2);
    nums.add(6);
    nums.add(4);
    nums.add(9);
    nums.add(2);

    for(int n: nums){
      System.out.println(n);
    }
      
  }
}

