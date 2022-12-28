package com.basics;

public class wrapperclass {
    public static void main(String[] args) {
        System.out.println("wrapper class");
        Integer myNumber=2000,myInt=12; //Wrapping , boxing
        Double  myDouble=8.22;
        System.out.println(myNumber);// directly print using variable name
        System.out.println(myDouble.doubleValue());// print using value() method
        int i=10;
        Integer k=Integer.valueOf(i); // assigning primitive data to wrapper object using value()
        Integer j=myInt;//assigning primitive data to wrapper object directly by variable name

        System.out.println(j);
        String n=myNumber.toString();//Converts Integer object value to String
        System.out.println(n.length());



    }
}
