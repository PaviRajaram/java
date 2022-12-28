package com.task1;
import java.util.Scanner;
class office{
        static String ofc_name="Arts-Inst"; //static keyword
           }
public class Example4 {
    public static void main(String[] args) {
        System.out.println("keywords Static and throw ");
        office obj=new office();//obj for class office
        int em_Id;
        String dsg;
        Scanner sc = new Scanner(System.in);
            System.out.print("Enter your ID :");
            em_Id = sc.nextInt(); //to get input
            System.out.print("Enter your designation :");
          dsg=sc.next();
        System.out.println(" ");
            if (em_Id<=100) {
                System.out.println("OFFICE : " + obj.ofc_name);
                System.out.println("EMPLOYEE_ID : " + em_Id);
                System.out.println("EMPLOYEE_DESIGNATION : " + dsg);
            }else
                // throw keyword-throws an Arithmetic exception id em_id >100
                throw new ArithmeticException("your id not found");





    }
}
