package library;

import java.util.Scanner;
class checkAvailability {
    String books[]={"b1","b2","b3"};
    void displayBooks(){
        for (String book:books) {
            System.out.println(book);
        }
    }
}
class toTakeBook extends checkAvailability{
    String Name;
    Double mobNum;
    String bookName;
    Scanner sc=new Scanner(System.in);
    public String getName() {
        Name= sc.next();
        return Name;
    }
    public Double getMobNum() {
        mobNum= sc.nextDouble();
        return mobNum;
    }
    public String getBookName() {
        bookName= sc.next();

        return bookName;
    }

}
class toReturnBook extends toTakeBook{
    String rName;
    Double rmobNum;
    String rbookName;
    Scanner sc=new Scanner(System.in);
    public String getrName() {
        rName= sc.next();
        return rName;
    }
    public Double getrMobNum() {
        rmobNum= sc.nextDouble();
        return rmobNum;
    }
    public String getrBookName() {
        rbookName= sc.next();
        return rbookName;
    }
}
public class LibraryManagement extends toReturnBook {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("welcome");
        LibraryManagement p1 = new LibraryManagement();
        int number;
        System.out.println("To take books enter 1");
        System.out.println("To return books enter 2");
        System.out.println("To check availability 3");
        System.out.print("Enter Number :");
        number = sc.nextInt();
        switch (number) {
            case 1: {
                System.out.println("Name");
                p1.getName();
                System.out.println("Mobile number");
                p1.getMobNum();
                System.out.println("Book name you need");
                p1.getBookName();
                System.out.println("Return the book without any damages ");

            }
            break;
            case 2: {
                System.out.println("Name");
                p1.getrName();
                System.out.println("Mobile number");
                p1.getrMobNum();
                System.out.println("Book name to return");
                p1.getrBookName();
                System.out.println("Thank you come again");
            }
            break;
            case 3: {
                p1.displayBooks();
            }
            break;
            default:
                System.out.println("thankyou");
        }
    }
}
