//Custom Exceptions can also be defined
class NewException extends Exception{
	public NewException(String str){
		super(str);
	}
}

public class ThrowDemo {

	public static void main(String[] args) {
		
		int i = 20;
		int j = 0;

		try {
			j = 18/i;
			System.out.println(j/i);

			if(j<=0){
				
				//When any error occures it will thrown to catch and resolve
				throw new NewException("value less than 0 not allowed");
			}
		} 

		catch(NewException err){
			System.out.println("The default value is 18"+err);
		}
		catch(ArithmeticException err){
			System.out.println("Arithmatic error");
		}
		catch(Exception e){
			System.out.println("Something went wrong"+e);
		}

		//Exception or No exception this will be executed
		//Always close ther esource in finally block
		finally {
			System.out.println("Bye");
		}
	}
	
}
