package com.task1;

public class Example2 {
    public static void main(String[] args) {
        //cast Double to int
        Double number=15.63;                     //wrapper class
        System.out.println("Double number = "+number);
        int intNumber= number.intValue();        //to convert into primitive datatype using value()
        System.out.println("Double to integer ="+intNumber);
        double dNum=43.6;
        System.out.println("Primitive double number= "+dNum);
        int iNum=(int) dNum;               // to assign primitive double to primitive int
        System.out.println("Primitive int number= "+iNum);

    }
}
