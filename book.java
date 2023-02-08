import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class book {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        List<memberReg> list=new ArrayList<>();
        Integer n;
        memberReg member1=new memberReg();
            System.out.println("Enter your Registration number");
            n= sc.nextInt();
            member1.setRegNum(n);
            list.add(member1);
        int c,m;
        do {
            theBooks theBook=new theBooks();
            theBook.displayMenu();
            System.out.println("Enter your choice");
            c= sc.nextInt();
            System.out.println("Enter your Registration Number");
            m= sc.nextInt();
            int v;
            v=m-n;
            memberReg obj=list.get(v);
            switch (c){
                case 1:
                {
                    System.out.println("Books Available "+theBook.books);
                }break;
                case 2:{
                    System.out.println("Enter your Name");
                    member1.setName(sc.next());
                    System.out.println("Enter your Registration Number");
                    member1.setRegNum(sc.nextInt());
                    System.out.println("Your name :"+member1.getName()+"  "+"Your Id"+member1.getRegNum());
                }break;
                case 3:{
                    obj.checkInBook();
                }break;
                case 4:{
                    obj.checkOutBook();
                }break;
                default:
                    System.out.println("PRESS 0 TO EXIT");
                    break;
            }
        }while(c!=0);
        }
}
class checkIn extends theBooks{
    String bookName;
    Scanner sc=new Scanner(System.in);
    theBooks theBook=new theBooks();
    void checkInBook(){
            System.out.println("Enter book name");
            bookName=sc.next();
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

    }
    void checkOutBook(){
        System.out.println("Enter book name");
        bookName=sc.next();
            if (theBook.books.contains(bookName)) {
                System.out.println("Book not matched");
            } else {
                theBook.books.add(bookName);
                System.out.println("Books available Now ");
                for (String book : theBook.books) {
                    System.out.println(book);
                }
        }
    }
}
class memberReg extends checkIn{
    String name ;
    int regNum;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getRegNum() {
        return regNum;
    }
    public void setRegNum(int regNum) {
        this.regNum = regNum;
    }
}
class theBooks{
    ArrayList<String> books = new ArrayList<>();
    void displayMenu(){
        System.out.println("press 0 to Exit");
        System.out.println("press 1 to checkAvailability");
        System.out.println("Press 2 to Register");
        System.out.println("Press 3 to CheckIn");
        System.out.println("Press 4 to CheckOut");
        books.add("b1");
        books.add("b2");
        books.add("b3");
        books.add("b4");
    }

    /*ArrayList<Integer> list=new ArrayList<>();
    void addMember(){
        for(int i=0;i<3;i++){
            memberReg mr=new memberReg();
            list.add(mr.regNum);
        }*/

}

