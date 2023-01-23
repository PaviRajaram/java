package LibraryManagement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;
public class getBooks  {
    String Name;
    Double mobNum;
    String bookName;
    book btt=new book();
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






