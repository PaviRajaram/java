package com.task1;

public class Example1 {
    public static void main(String[] args) {
        System.out.println("Alphabets");  //to print alphabets a to z using char data type
        char alpha='a',ALPHA='A';
        int i,j=0;               //i=initializer
        for(i=0;i<26;i++)        //for loop
        {
            System.out.print(ALPHA);
            ALPHA++;
        }
        System.out.println(" ");
        while(j<26){         //while loop
            System.out.println(alpha);
            j++;
            alpha++;
        }


    }
}
