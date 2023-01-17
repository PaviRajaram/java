package library;
import java.util.ArrayList;
//import java.util.Iterator;
import java.util.Scanner;

class books {
    void displayBooks(String bp1) {
        ArrayList<String> book = new ArrayList<>();
        book.add("b1");
        book.add("b2");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter same number here : ");
        int number = sc.nextInt();
        if (number == 3) {
            System.out.print("Books available in library:");
            for (String bl : book)
                System.out.print(bl + " ");
        }
        if (number == 1) {
            System.out.println("");
            for (String bl : book) {
                if (bl.equals(bp1)) {
                    System.out.println("book " + bp1 + " is available");
                    System.out.println("Return the book on or before 10 days from today");
                }
            }
            book.remove(bp1);
            System.out.println("");
            System.out.print("Books available in library after issuing:");
            for (String bl : book)
                System.out.print(bl + " ");
        }
        if (number == 2) {
            book.remove(bp1);
            book.add(bp1);
            System.out.println("");
            System.out.print("Books available in library after returning:");
            for (String bl : book)
                System.out.print(bl + " ");
        }
    }
}

    class bookIssue extends books {
        void toTakeBook() {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter your name");
            String name = sc.next();
            System.out.println("Enter your mobile number");
            Double phNum = sc.nextDouble();
            System.out.println("Enter the book name you need");
            String bp1 = sc.next();
            displayBooks(bp1);
        }
    }

    class bookReturn extends bookIssue {
        void toReturnBook() {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter your name");
            String name = sc.next();
            System.out.println("Enter your mobile number");
            Double phNum = sc.nextDouble();
            System.out.println("Enter the book name you need");
            String bp1 = sc.next();
            displayBooks(bp1);
        }
    }

public class Library extends bookReturn{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("welcome to library");
        Library p1=new Library ();

        int number;
        System.out.println("To take books enter 1");
        System.out.println("To return books enter 2");
        System.out.println("To check availability 3");
        System.out.print("Enter Number :");
        number = sc.nextInt();
        switch (number) {
            case 1: {
                p1.toTakeBook();
            }
            break;
            case 2: {
                p1.toReturnBook();
                System.out.println("Thank you come again");
            }
            break;
            case 3: {
                p1.displayBooks("b");
            }
            break;
            default:System.out.println("thankyou");
        }
    }
    }

