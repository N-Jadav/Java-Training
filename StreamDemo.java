import java.util.List;
import java.util.stream.Stream;
import java.util.Arrays;

public class StreamDemo {

    public static void main(String[] args) {
        
        List<Integer> nums = Arrays.asList(3,6,1,4,8);

        //whatever operation we perform on stream will not affect nums
        Stream<Integer> s1 = nums.stream();
        Stream<Integer> s2 = s1.filter(n->(n%2==0));
        Stream<Integer> s3 = s2.map(n->n*2);
        int result = s3.reduce(0,(c,e)->c+e);
        System.out.println(result);

        int result1 = nums.stream().filter(n->n%2==0).map(n->n*2).reduce(0, (c,e)->c+e);
        System.out.println(result1);

        //Streams are used only once
        s1.forEach(n->System.out.println(n));
    }
    
}
