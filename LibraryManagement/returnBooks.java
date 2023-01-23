package LibraryManagement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class returnBooks extends getBooks{
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
        getBooks tkb=new getBooks();
        String rdt=tkb.getTheDate();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the returning Date : ");
        String date = sc.next();
        SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyy");
        Date rdb=sdf.parse(rdt);
        Date rdate=sdf.parse(date);
        System.out.println("Return date : "+rdt);
        if(rdate.equals(rdb)){
            System.out.println("Thank you for returning on time");
        }if(rdate.before(rdb)){
            System.out.println("still have time to return book...");
        }if(rdate.after(rdb)) {
            long day=rdate.getTime()-rdb.getTime();
            long days=day/1000/60/60/24;
            System.out.println("days: "+days);
            System.out.println("pay fine "+days*2+"Rs(2rs per day)");
        }
    }
    void returnDate(){
        getBooks tkb=new getBooks();
        String rdt=tkb.getTheDate();
        System.out.println("Return date : "+rdt);
        }
    }

