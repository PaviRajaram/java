package library;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
class checkAvailability {
    ArrayList<String> books = new ArrayList<>();
     public ArrayList<String> displayBooks(String b) {
        //ArrayList<String> books=new ArrayList<>();
        books.add("b1");
        books.add("b2");
        books.add("b3");
        books.add("b4");
        for (String book : books) {
            System.out.println(book);
        }
        return books;
    }
    void displayMenu(){
        System.out.println("press 0 to Exit");
        System.out.println("press 1 to checkAvailability");
        System.out.println("press 2 to get book");
        System.out.println("press 3 to return book");
        System.out.println("press 4 to check return date");
        System.out.println("Press 5 to Register");
    }
}
class toTakeBook extends checkAvailability{
    String Name;
    Double mobNum;
    String bookName;
    checkAvailability btt=new checkAvailability();
    Scanner sc = new Scanner(System.in);
    public void getName() {
        Name = sc.next();
    }

    public void getMobNum() {
        mobNum = sc.nextDouble();
    }
    public void getBookName() {
        bookName = sc.next();
        ArrayList<String> tb = btt.displayBooks(bookName);
        if (tb.contains(bookName)) {
            tb.remove(bookName);
            System.out.println(bookName + " is available you can take");
            System.out.println("Book taken date :");
            System.out.println("Books now available:");
            for (String book : tb) {
                System.out.println(book);
            }
        }else {
            System.out.println("Not available");
        }
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
class toReturnBook extends toTakeBook{
    String Name;
    Double mobNum;
    String bookName;
    Scanner sc=new Scanner(System.in);
    public void getName() {
        Name= sc.next();
    }
    public void getMobNum() {
        mobNum= sc.nextDouble();
    }
    public void getBookName() {
        bookName= sc.next();
        ArrayList<String> rb= btt.displayBooks(bookName);
        rb.add(bookName);
        System.out.println("Books now available:");
        for (String book : rb) {
            System.out.println(book);
        }
    }
    void returnTheDate() throws ParseException {
        toTakeBook tkb=new toTakeBook();
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
    void returnDate(){
        toTakeBook tkb=new toTakeBook();
        String rdt=tkb.getTheDate();
        System.out.println("Return date : "+rdt);
    }
    }

interface memberRegistration {

    default void register(){
        System.out.println("press Yes to continue registration");
        String c;
        ArrayList<Integer> rId = new ArrayList<>();
        ArrayList<String> rName = new ArrayList<>();
        rName.add("Pavi");
        rId.add(124);
        do {
            Scanner sc = new Scanner(System.in);
            //c=sc.next();
            String name;
            Integer id;
            System.out.println("Enter name");
            name = sc.next();
            System.out.println("Enter id (ex:123)");
            id = sc.nextInt();
            System.out.println("Registered id's and name's ");
            if (rId.contains(id)) {
                System.out.println("Id Already registered try again..");
            } else {
                rId.add(id);
                rName.add(name);
                System.out.print(rId);
                System.out.println(rName);
            }
            System.out.println("press any key to exit registration");
            c= sc.next();
        }while(Objects.equals(c, "yes"));
    }
}

public class LibraryManagement implements memberRegistration {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        System.out.println("welcome");
        checkAvailability b = new checkAvailability();
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
                    toTakeBook p = new toTakeBook();
                    System.out.println("To take book enter Your Name");
                    p.getName();
                    System.out.println("Mobile number");
                    p.getMobNum();
                    System.out.println("Book Name");
                    p.getBookName();
                    p.getTheDate();
                }
                break;
                case 3: {
                    toReturnBook p1 = new toReturnBook();
                    System.out.println("To return book enter your Name");
                    p1.getName();
                    System.out.println("Mobile number");
                    p1.getMobNum();
                    System.out.println("Book name");
                    p1.getBookName();
                    p1.returnTheDate();

                }break;
                case 4: {
                    toReturnBook p1 = new toReturnBook();
                    p1.returnDate();
                }
                break;
                case 5:
                {
                    memberRegistration reg=new LibraryManagement() ;
                    reg.register();
                }break;
                default:
                    System.out.println("Enter between 0 to 5");
            }
        }
        while(number!=0);
    }
}
