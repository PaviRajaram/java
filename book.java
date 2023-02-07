import java.util.ArrayList;
import java.util.Scanner;

public class book {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int c;
        do {
            memberReg member1=new memberReg();
            member1.displayMenu();
            System.out.println("Enter your choice");
            c= sc.nextInt();
            switch (c){
                case 1:
                {
                    System.out.println("Books Available "+member1.books);
                }break;
                case 2:{
                    System.out.println("Enter your Name");
                    member1.setName(sc.next());
                    System.out.println("Enter your Registration Number");
                    member1.setRegNum(sc.next());
                    System.out.println("Your name :"+member1.getName()+"Your Id"+member1.getRegNum());
                }break;
                case 3:{
                    checkIn checkInObj=new checkIn();
                    checkInObj.checkInBook();
                }break;
                case 4:{
                    checkIn checkInObj=new checkIn();
                    checkInObj.checkOutBook();
                }break;
                default:
                    System.out.println("PRESS 0 TO EXIT");
                    break;
            }
        }while(c!=0);
        }
}
class checkIn{
    String regNum,bookName;
    Scanner sc=new Scanner(System.in);
    memberReg theBooks=new memberReg();
    void checkInBook(){
        System.out.println("Enter Registration Number");
        regNum=sc.next();
            System.out.println("Enter book name");
            bookName=sc.next();
            if (theBooks.books.contains(bookName)){
                System.out.println("Book available");
                theBooks.books.remove(bookName);
                System.out.println("Books available Now ");
                for (String book:theBooks.books) {
                    System.out.println(book);
                }
            }else System.out.println("Not available");
    }
    void checkOutBook(){
        System.out.println("Enter Registration Number");
        regNum=sc.next();
        System.out.println("Enter book name");
        bookName=sc.next();
        if (theBooks.books.contains(bookName)){
            System.out.println("Not matched");
        }else {
            System.out.println("Thank you");
            theBooks.books.add(bookName);
            System.out.println("Books available after returning ");
            for (String book:theBooks.books) {
                System.out.println(book);
            }
        }
    }
}
class memberReg{
    String name ,regNum;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getRegNum() {
        return regNum;
    }
    public void setRegNum(String regNum) {
        this.regNum = regNum;
    }
    void displayMenu(){
        System.out.println("press 0 to Exit");
        System.out.println("press 1 to checkAvailability");
        System.out.println("Press 2 to Register");
        System.out.println("Press 3 to CheckIn");
        System.out.println("Press 4 to CheckOut");
    }
    ArrayList<String> books = new ArrayList<>();
    memberReg() {
        books.add("b1");
        books.add("b2");
        books.add("b3");
        books.add("b4");
    }
}
