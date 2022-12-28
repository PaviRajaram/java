package com.task1;

import java.util.Scanner;

public class Example7 {
    public static void main(String[] args) {
        System.out.println("OPERATORS -AND,OR,XOR");
        Scanner sc =new Scanner(System.in);
        int num1,num2,result;
        System.out.print("Enter 2 numbers ");
        num1=sc.nextInt();
        num2=sc.nextInt();
        result=num1&num2;
        System.out.println("num1 & num2 :"+result);
        System.out.println("Binary value of result :"+Integer.toBinaryString(result));
        result=num1|num2;
        System.out.println("num1 | num2 :"+result);
        System.out.println("Binary value of result :"+Integer.toBinaryString(result));
        result=num1^num2;
        System.out.println("num1 ^ num2 :"+result);
        System.out.println("Binary value of result :"+Integer.toBinaryString(result));

    }
}
