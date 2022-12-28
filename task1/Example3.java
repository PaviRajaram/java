package com.task1;

public class Example3 {
    public static void main(String[] args) {
        long maxNumber= Long.MAX_VALUE; // directly initialized with min
        System.out.println("Max long number "+maxNumber);
        long minNumber= Long.MIN_VALUE;
        System.out.println("Minimum long number "+minNumber);

        Long maxNum= (long)Math.pow(2,63); //using math function -convert double to Long
        System.out.println("maximum Long number using math function "+maxNum);
        Long minNum= (long)Math.pow(-2,63); //using math function
        System.out.println("minimum Long number using math function "+minNum);
        System.out.println("Max int value= "+Integer.MAX_VALUE);

          }
}
