import java.util.ArrayList;
import java.util.Arrays;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Sorting {
  public static void main(String[] args) {

    Comparator<Integer> com = new Comparator<Integer>()
    {
      public int compare(Integer i, Integer j){
        if(i%10 > j%10)
          return 1;
        else
          return -1;
      }
    };

    Comparator<String> com1 = new Comparator<String>() {
      public int compare(String i, String j){
        if(i.length() > j.length())
          return 1;
        else    
          return -1;
      }
    };
    
    // List<Integer> nums = new ArrayList<>();

    // nums.add(54);
    // nums.add(16);
    // nums.add(41);
    // nums.add(73);
    List<Integer> nums = Arrays.asList(54, 16, 41, 73);

    //This will sort the numbers with the default logic it has
    Collections.sort(nums);

    //To sort the numbers with your ownlogic, we need to use Comparator
    // Lets try to sort the numbers with the last digit like : 41, 73, 54, 16
    Collections.sort(nums,com);
    System.out.println(nums);

    List<String> str = new ArrayList<String>();

    str.add("Java");
    str.add("Python");
    str.add("C++");
    str.add("Javascript");

    Collections.sort(str, com1);

    System.out.println(str);
  }
  
    
}
