import java.util.ArrayList;
import java.util.Scanner;

public class book {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int c;
        do {
            memberReg member1=new memberReg();
            theBooks theBook=new theBooks();
            theBook.displayMenu();
            System.out.println("Enter your choice");
            c= sc.nextInt();
            switch (c){
                case 1:
                {
                    System.out.println("Books Available "+theBook.books);
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
    theBooks theBook=new theBooks();
    void checkInBook(){
        memberReg MR=new memberReg();
        System.out.println("Enter Registration Number");
        MR.setRegNum(sc.next());
        theBook.addMember();
            System.out.println("Enter book name");
            bookName=sc.next();
            if (MR.list.contains(regNum)) {
                if (theBook.books.contains(bookName)) {
                    System.out.println("Book available,return on date");
                    theBook.books.remove(bookName);
                    System.out.println("Books available Now ");
                    for (String book : theBook.books) {
                        System.out.println(book);
                    }
                } else {
                    System.out.println("Not available");
                }
            }else {
                System.out.println("Registration number not found");
            }
    }
    void checkOutBook(){
        memberReg MR=new memberReg();
        System.out.println("Enter Registration Number");
        MR.setRegNum(sc.next());
        theBook.addMember();
        System.out.println("Enter book name");
        bookName=sc.next();
        if (MR.list.contains(regNum)) {
            if (theBook.books.contains(bookName)) {
                System.out.println("Book not matched");
            } else {
                theBook.books.add(bookName);
                System.out.println("Books available Now ");
                for (String book : theBook.books) {
                    System.out.println(book);
                }
            }
        }else {
            System.out.println("Registration number not found");
        }
    }
}
class memberReg{
    ArrayList<String> list=new ArrayList<>();
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
        for(int i=0;i<3;i++){
            memberReg mr=new memberReg();
            list.add(mr.regNum);
        }
    }
}
class theBooks{
    void displayMenu(){
        System.out.println("press 0 to Exit");
        System.out.println("press 1 to checkAvailability");
        System.out.println("Press 2 to Register");
        System.out.println("Press 3 to CheckIn");
        System.out.println("Press 4 to CheckOut");
    }
    ArrayList<String> books = new ArrayList<>();
    theBooks() {
        books.add("b1");
        books.add("b2");
        books.add("b3");
        books.add("b4");
    }
    ArrayList<String> list=new ArrayList<>();
    void addMember(){
        for(int i=0;i<3;i++){
            memberReg mr=new memberReg();
            list.add(mr.regNum);
        }
    }
}

