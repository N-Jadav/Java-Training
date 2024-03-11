//One way to create thread
class Thread1 implements Runnable {
  public void run(){
    for(int i=0; i<=10; i++){
      System.out.println("Running Thread1");

      //This will let the Thread wait for 10 milliseconds
      try {
        Thread.sleep(10);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }
  }
}

//Another way to create thread
class Thread2 extends Thread {
  public void run(){
    for(int i=0; i<=10; i++){
      System.out.println("Running Thread2...");
    }
  }
}


public class Threads {

  public static void main(String[] args) {

    //One way to start the thread
    Thread2 t2 = new Thread2();

    //Another way
    Runnable obj1 = () -> {
      for(int i=0; i<=10; i++){
        System.out.println("Running Thread1");

        //This will let the Thread wait for 10 milliseconds
        try {
          Thread.sleep(10);
        } catch (InterruptedException e) {
          e.printStackTrace();
        }
      }
    };
    
    Thread t1 = new Thread(obj1);
    
    t2.start();

    //Start wont work for Runnable as it does not have that fuinction

    t1.setPriority(Thread.MAX_PRIORITY);

    System.out.println(t1.getPriority());

    t1.start();
      
  }
    
}
