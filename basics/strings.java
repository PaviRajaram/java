package com.basics;

import java.util.Scanner;

public class strings {
    public static void main(String[] args) {
        System.out.println("Strings");
        Scanner input =new Scanner(System.in);
        String name="pavithra";   // declaring string variable and assigning "value"
        System.out.println("My name is "+name);
        System.out.println("length of the name  = "+name.length());    // string methods
        System.out.println("Name in uppercase = "+name.toUpperCase());
        System.out.println("Name in lowercase = "+name.toLowerCase());
        System.out.println("index v in name = "+name.indexOf('v'));
        String place;
        System.out.print("Enter your place");
        place= input.next();                //to get string input
        System.out.println("Place = "+place);

    }
}
