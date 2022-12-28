package com.basics;

public class operators {
    public static void main(String[] args) {
        System.out.println("Operators");
        int a=10,b=150;
        int sum=a+b-a*10;//arithmetic operator- BODMAS
        System.out.println("Sum of a and b= "+sum);

        sum+=a;//Assignment operator
        System.out.println("Sum of a and b= "+sum);
        sum*=10;//Assignment operator
        System.out.println("Sum of a and b= "+sum);

        int x=2,y=3;
        x&=4;//Bitwise AND operator with assignment operator
        System.out.println("x value="+x);

        System.out.println(y==2 && y==3);//logical Operator -prints false
        System.out.println(y<=3 && y==3);//logical Operator -prints true
        System.out.println(y<=2 || y==3);//logical Operator -prints true
    }
}
