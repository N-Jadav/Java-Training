class NoClass{

	//One way would be to handle the exception in the child class itself
	public void display(){
		try{
				Class.forName("ABC");
		} catch(Exception err){
				System.out.println(err);
		}
	}

	//Abother way would be to Throws exception for the parent to catch
	public void show() throws ClassNotFoundException{
		Class.forName("ABC");
	}
}

public class ThrowsException {
	public static void main(String[] args) {

		NoClass obj = new NoClass();
		try{
			obj.show();
		} catch(Exception err){
			err.printStackTrace();
			System.out.println(err);
		}

	}
}
