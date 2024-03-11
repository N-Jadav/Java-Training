class A{
    public void demo(){
        System.out.println("inside A");
    }
}

public class AnonymousInnerClass {
    public static void main(String[] args) {

        //This is an anonymous class defination, as we are manipulating the demo method of the A class
        //Anonymous classes are useful when the methods of class needs to be changed once only
        A obj = new A()
        {
            public void demo(){
                System.out.println("inside Anonymous");
            }
        };
        obj.demo(); 
        
    }
}
