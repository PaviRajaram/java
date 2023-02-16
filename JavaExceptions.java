package study;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;
class UserDefinedException {
    Scanner sc = new Scanner(System.in);

    void shopping() {
        System.out.println("Shopping:");
        int amt;
        System.out.println("Enter Amount");
        amt = sc.nextInt();
        try {
            if (amt >= 200) {
                System.out.println("You have a access");
            }
        } catch (Exception ex) {
            System.out.println("Access denied..insufficient amount");
        }
    }
}
class InputMismatchExceptions{
    Scanner sc=new Scanner(System.in);
    void add() throws InputMismatchException,ArithmeticException
    {
        System.out.println("Addition ");
        int a,b,c;
        System.out.println("Enter values for a and b ");
        a=sc.nextInt();
        b=sc.nextInt();
        c=a+b;
        System.out.println("Add:"+c);
        c=a/b;
        System.out.println("Divide:"+c);
    }
}
class ArrayIndexException {
    UserDefinedException ude=new UserDefinedException();
    Scanner sc=new Scanner(System.in);
    void displayNumbers() {
    int[] a = new int[3];
    int c = 0;
        System.out.println("Enter number of values");
    int n = sc.nextInt();
        System.out.println("Enter numbers to add");
        try
        {
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            c += a[i];
        }
    }catch(ArrayIndexOutOfBoundsException|InputMismatchException ex)
    {
        System.out.println("Invalid number of inputs or Invalid type of input");
    }
        NoSuchExceptions nse=new NoSuchExceptions();
        nse.printList();
}
}
class NoSuchExceptions {
    void printList(){
        ArrayList<Integer> number=new ArrayList<>();
        try{
            System.out.println(number.iterator().next());
        }catch (NoSuchElementException ex){
            System.out.println("NoSuchElement"+ex.getMessage());
        }
        NullPointerExceptions npe=new NullPointerExceptions();
        npe.printName();
    }
}
class NullPointerExceptions{
    void printName(){
        String name=null;
        try {
            System.out.println("Length of name :"+name.length());
        }catch (NullPointerException ex){
            System.out.println("NullPointerExceptions");
        }
        UserDefinedException ude=new UserDefinedException();
        ude.shopping();
    }
}
public class JavaExceptions {
    public static void main(String[] args) {
        InputMismatchExceptions ime=new InputMismatchExceptions();
        try{
            ime.add();
        }catch (Exception ex){
            System.out.println("Invalid input"+ex.getMessage());
        }
        ArrayIndexException aie=new ArrayIndexException();
        aie.displayNumbers();
    }
}
