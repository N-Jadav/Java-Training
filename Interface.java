interface Car{
    // By default the methods are public abstract
    // All variables in interface is final and static
    void start();
    void accelerate();
    void brake();
    void stop();
}

interface CyberTruck extends Car{
    void selfdrive();
}

class Sonata implements Car{

    public void accelerate() {
        System.out.println("Accelerated!!!");
        
    }

    public void brake() {
        System.out.println("Brake!!!");
        
    }

    public void start() {
        System.out.println("Started!!!");
        
    }

    public void stop() {
        System.out.println("Stop!!!");
        
    }
    
}

class Tesla implements CyberTruck{

    public void accelerate() {
        System.out.println("Accelerated!!!");
        
    }

    public void brake() {
        System.out.println("Brake!!!");
        
    }

    public void start() {
        System.out.println("Started!!!");
        
    }

    public void stop() {
        System.out.println("Stop!!!");
        
    }

    public void selfdrive() {
        System.out.println("Self Driving!!!");
        
    }
    
}

public class Interface {

    public static void main(String[] args) {
        
        Sonata NLine = new Sonata();
        NLine.start();
        NLine.accelerate();
        NLine.brake();
        NLine.stop();
        Tesla X = new Tesla();
        X.start();
        X.accelerate();
        X.selfdrive();
        X.brake();
        X.stop();

    }
    
}
