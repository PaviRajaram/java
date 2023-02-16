package study;
interface Vehicle{
    void color();
    void run();
}
class car implements Vehicle{
    @Override
    public void run() {
        System.out.println("car is running");
    }
    public void color(){
        System.out.println("Black color");
    }
}
class Bike{
    String model;
    int  price(String model) {
        int amt = 20000;
        this.model = model;
        System.out.println("Brand:HERO");
        System.out.println("Bike : " + this.model);
        return amt;
    }
    int price(String model,String color){
            int amt=30000;
        System.out.println("Brand:HERO");
        System.out.println("Bike : "+ model+":  "+color);
        return amt;
    }

}
public class Polymorphism {
    public static void main(String[] args) {
        Vehicle vc=new car();
        System.out.println("CAR :");
        vc.run();
        vc.color();
        Bike bk=new Bike();
        System.out.println("BIKE");
        System.out.println("Price: "+bk.price("KT5"));
        System.out.println("Price: "+bk.price("R18","BLUE"));
    }

}
