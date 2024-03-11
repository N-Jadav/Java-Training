enum Status{
    Running, Failed, Pending, Success;
}

enum Phones{
    Apple(1800), Samsung(1200), Motorola(1000), Sony(800);

    private int price;

    private Phones(int price){
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    


}
public class Enums {

    public static void main(String[] args) {
        Status s = Status.Running;
        System.out.println(s);

        // Phones phone = Phones.Apple;
        // System.out.println(phone+" "+phone.getPrice());
        for(Phones phone: Phones.values()){
            System.out.println(phone+" "+phone.getPrice());
        }
    }
    
}
