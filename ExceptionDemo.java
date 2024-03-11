public class ExceptionDemo {

    public static void main(String[] args) {
        int i = 2;
        int j = 12;
        int arr[] = new int[8];
    
        try {
            System.out.println(j/i);
            System.out.println(arr[9]);
        }
        catch(ArithmeticException err){
            System.err.println("Cannot divide by 0");
        }
        catch(ArrayIndexOutOfBoundsException err){
            System.err.println("Array index out of bounds");
        }
        catch(Exception e){
            System.err.println("Something went wrong");
        }

        System.out.println("Bye");
    
    }
    
}
