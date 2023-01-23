package LibraryManagement;
import java.text.ParseException;
import java.util.Scanner;

class newLibrary implements memberRegistration{

    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        System.out.println("welcome");
        book b = new book();
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
                    getBooks p = new getBooks();
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
                    returnBooks p1 = new returnBooks();
                    System.out.println("To return book enter your Name");
                    p1.getName();
                    System.out.println("Mobile number");
                    p1.getMobNum();
                    System.out.println("Book name");
                    p1.getBookName();
                    p1.returnTheDate();

                }break;
                case 4: {
                    returnBooks p1 = new returnBooks();
                    p1.returnDate();;
                }
                break;
                case 5:
                {
                    memberRegistration reg=new newLibrary() ;
                    reg.register();
                }break;
                default:
                    System.out.println("Enter between 0 to 5");
            }
        }
        while(number!=0);
        }
    }

