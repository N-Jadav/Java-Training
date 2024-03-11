//Collection API is a concept 
//Collection is interface which in turn is used by other interfaces like List, Queue, Set
//Collections is class

import java.util.ArrayList;
import java.util.Collection;

public class CollectionAPI {
    
    public static void main(String[] args) {

        //Here a ArrayList Collection of Integer is declared
        Collection<Integer> nums = new ArrayList<Integer>();
        nums.add(2);
        nums.add(6);
        nums.add(4);
        nums.add(9);

        for(int n: nums){
            System.out.println(n);
        }      
    }   
}
