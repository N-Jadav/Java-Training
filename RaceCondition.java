class Counter {
  int count;

  //This will ensure that only one thread can work at  a time
  public synchronized void increment(){
    count++;
  }
}

//Both threads are trying to update the count,which causes inconsistency.
// To resolve this synchronized keyword is added
public class RaceCondition {

  public static void main(String[] args) throws InterruptedException {

    Counter c = new Counter();

    //Another way
    Runnable obj1 = () -> {
      for(int i=0; i<=1000; i++){
        c.increment();
      }
    };

    Runnable obj2 = () -> {
      for(int i=0; i<=1000; i++){
        c.increment();
      }
    };
    
    //New state
    Thread t1 = new Thread(obj1);
    Thread t2 = new Thread(obj2);
    
    //Runnable state
    t1.start();
    t2.start();

    // It waits for the threads to finish and join back to main
    t1.join();
    t2.join();
      
  }
}
