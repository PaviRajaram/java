package com.task1;
import java.util.Scanner;

public class Example6 {
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);

        String input;
        System.out.println("Type any sentence here");
        input = sc.nextLine();
        System.out.println("Output :" + input.toUpperCase());

        String line;
        System.out.println("Type any sentence here");
        line = sc.nextLine();
        line=line.replaceAll("\\s+", " ").trim(); //removed spaces
        char[] charArr = line.toCharArray();
        boolean space = true;
        for (int i = 0; i < charArr.length; i++) {
            if (Character.isLetter(charArr[i])) {
                if (space) {
                    charArr[i] = Character.toUpperCase(charArr[i]);
                    space = false;
                }
            } else {
                space = true;
            }
        }
            line = String.valueOf(charArr);
            System.out.print("output : ");
            System.out.println(line);

    }
}

