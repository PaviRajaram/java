package com.basics;

import java.util.Scanner;

public class Scanners {
    public static void main(String[] args) {
        System.out.println("Scanner");
        String name="pavi";            //directly assigning string value
        System.out.println("Name ="+name);
        Scanner input=new Scanner(System.in);//scanner statement
        int a;
        System.out.print("type value of a=");
        a= input.nextInt();           //to get integer value
        System.out.println(" value of a is "+a);
        String name1;
        System.out.print("Type your name = ");
        name1= input.next();            //to get string value
        System.out.println("my name is "+name1);
    }
}
