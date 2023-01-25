package library;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
interface checkAvailability {
    ArrayList<String> books = new ArrayList<>();
     default ArrayList<String> displayBooks(String b) {
        books.add("b1");
        books.add("b2");
        books.add("b3");
        books.add("b4");
        for (String book : books) {
            System.out.println(book);
        }
        return books;
    }
    default void displayMenu(){
        System.out.println("press 0 to Exit");
        System.out.println("press 1 to checkAvailability");
        System.out.println("press 2 to get book");
        System.out.println("press 3 to return book");
        System.out.println("press 4 to check return date");
        System.out.println("Press 5 to Register");
    }
}
class toTakeBook implements checkAvailability {
    String Name;
    int id;
    Scanner sc = new Scanner(System.in);
    public void getName() {
        System.out.println("Enter your name");
        Name = sc.next();
    }
    public void getId() throws ParseException {
        memberRegistration mR = new memberRegistration();
        System.out.println("Enter your Id");
        id = sc.nextInt();
        mR.setId(id);
        int rid = mR.getId();
        if(id==rid){
            getBooks gb=new getBooks();
            gb.getBookName();
        }else System.out.println("Id not found");
    }
    String getTheDate(){
        SimpleDateFormat sdt = new SimpleDateFormat("dd-MM-yyyy");
        Calendar date = Calendar.getInstance();
        date.setTime(new Date());
        String tDate = sdt.format(date.getTime());
        System.out.println("Book taken date :" + tDate);
        date.add(Calendar.DATE, 10);
        String rDate;
        rDate= sdt.format(date.getTime());
        return rDate;
    }
}
class getBooks extends toTakeBook{
    String bookName;
    Scanner sc = new Scanner(System.in);
    public void getBookName() {
        System.out.println("Enter book name");
        bookName = sc.next();
        checkAvailability btt = new toTakeBook();
        System.out.println("List of books in library");
        ArrayList<String> tb = btt.displayBooks(bookName);
        if (tb.contains(bookName)) {
            tb.remove(bookName);
            System.out.println(bookName + " is available you can take");
            toTakeBook ttb=new toTakeBook();
            ttb.getTheDate();
        }else {
            System.out.println("Not available");
        }
    }
}
class toReturnBook extends getBooks  {
    String Name;
    int id;
    Scanner sc = new Scanner(System.in);
    public void getName() {
        System.out.println("Enter your name");
        Name = sc.next();
    }
    public void getId() throws ParseException {
        memberRegistration mR = new memberRegistration();
        System.out.println("Enter your Id");
        int rid = mR.getId();
        id = sc.nextInt();
        if(id==rid) {
        returnBooks rb=new returnBooks();
        rb.getBookName();
        }
    }
    void returnTheDate() throws ParseException {
        getBooks tkb=new getBooks();
        String rdt=tkb.getTheDate();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the returning Date : ");
        String date = sc.next();
        SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyy");
        Date rdb=sdf.parse(rdt);
        Date rDate=sdf.parse(date);
        System.out.println("Return date : "+rdt);
        if(rDate.equals(rdb)){
            System.out.println("Thank you for returning on time");
        }if(rDate.before(rdb)){
            System.out.println("still have time to return book...");
        }if(rDate.after(rdb)) {
            long day=rDate.getTime()-rdb.getTime();
            long days=day/1000/60/60/24;
            System.out.println("days: "+days);
            System.out.println("pay fine "+days*2+"Rs(2rs per day)");
        }
    }
}
class returnBooks {
    String bookName;
    Scanner sc = new Scanner(System.in);
    public void getBookName() throws ParseException {
        System.out.println("Enter book Name ");
        bookName= sc.next();
        checkAvailability btt = new toTakeBook();
        System.out.println("Books in library");
        ArrayList<String> rb= btt.displayBooks(bookName);
        rb.add(bookName);
        toReturnBook trb=new toReturnBook();
        trb.returnTheDate();
        System.out.println("Books now available:");
        for (String book : rb) {
            System.out.println(book);
        }
    }
    void returnDate(){
        getBooks tkb=new getBooks();
        String rdt=tkb.getTheDate();
        System.out.println("Return date : "+rdt);
    }
    }
class  memberRegistration {
    String name,address;
    int id;
    Long mobNum;
    Scanner sc=new Scanner(System.in);
    public void getName() {
        System.out.println("Enter your name ");
        name=sc.next();
    }
    public void getMobNum() {
        System.out.println("Enter your mobile number");
        mobNum=sc.nextLong();
    }

    public void getAddress() {
        System.out.println("Enter your address");
        address=sc.next();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
public class LibraryManagement implements checkAvailability{
    public static void main(String[] args) throws ParseException {

        Scanner sc = new Scanner(System.in);
        checkAvailability b = new LibraryManagement();
        int number;
        do {
            b.displayMenu();
            number = sc.nextInt();
            switch (number) {
                case 1: {
                    System.out.println("Books Available in Library");
                    b.displayBooks("b");
                }break;
                case 2: {
                    getBooks gb=new getBooks();
                    gb.getName();
                    gb.getId();
                }
                break;
                case 3: {
                   toReturnBook rb=new toReturnBook();
                   rb.getId();
                }break;
                case 4: {
                    returnBooks rb=new returnBooks();
                    rb.returnDate();
                }
                break;
                case 5:
                {
                    memberRegistration reg=new memberRegistration() ;
                    reg.getName();
                    reg.getMobNum();
                    reg.getAddress();
                    Random rn=new Random();
                    int id_s= rn.ints(3,200,300).sum();
                    System.out.print("Your id : ");
                    System.out.println(id_s);
                    reg.setId(id_s);
                    System.out.println("Registered");

                }break;
                default:
                    System.out.println("Enter between 0 to 5");
            }
        }
        while(number!=0);
    }
}
