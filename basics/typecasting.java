package com.basics;

public class typecasting {
    public static void main(String[] args) {
        System.out.println("TypeCasting");
        int num=20;
        double myDouble=9.88;
        System.out.println("num= "+num);
        System.out.println("myDouble=  "+myDouble);
        double num1=num;//automatic type casting -widening casting
        System.out.println("num1= "+num1);//prints converted value int into double
        int num2=(int)myDouble;//manual type casting -narrowing casting
        System.out.println("num2= "+num2);//prints converted of double into int


    }
}
