import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

// USer Input methods
public class UserIO {

    public static void main(String[] args) throws IOException {
        
        System.out.println("Enter a number");

        //1. This reads ASCII values
        int input1 = System.in.read();
        System.out.println(input1);

        //2. Another mway to read from user
        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader bf = new BufferedReader(in);
        int input2 = Integer.parseInt(bf.readLine());
        System.out.println(input2);


        //3. Another way to read
        Scanner sc = new Scanner(System.in);
        int input3 = sc.nextInt();
        System.out.println(input3);
        sc.close();
    }
    
}
