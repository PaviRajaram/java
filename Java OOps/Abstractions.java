package study;

import java.util.Scanner;

abstract class Laptop{
    static String model="i5";
    abstract void price();
    void printColor(){
        String color;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter color :");
        color=sc.next();
        if(color.equalsIgnoreCase("Black")){
            System.out.println("Available in all brands");
        }else System.out.println("Not available");
    }
}
class  Dell extends Laptop {
    public void price() {
        int price = 70000;
        System.out.println("Dell " + model + " : " + price);
    }
}
public class Abstractions {
    public static void main(String[] args) {
        Laptop lapObj=new Dell();
        lapObj.price();
        lapObj.printColor();
    }
}
