package com.task1;

import java.util.Scanner;

class decisionMaking {
    Scanner sc = new Scanner(System.in);
    int score, roll_no, no_student = 3,std;
    String student,grade;

    void displayGrade() {
        System.out.print("enter your standard Level");
        std = sc.nextInt();
        if (std ==10) {
            System.out.println("Grade 10th students");
            for (int i = 0; i <=no_student; i++) //for loop
            {
                System.out.println("Enter your roll_no, name and score");
                roll_no = sc.nextInt();
                student = sc.next();
                score = sc.nextInt();
                if (score == 100)                         //if, else, if else,if else if
                    System.out.println(" O GRADE");
                else if (score > 80) {
                    System.out.println(" A GRADE");
                } else if (score >= 50) {
                    System.out.println(" B GRADE");
                } else System.out.println("You are fail in 10th");

            }
        } else if(std==12){
            System.out.println("Grade 12th students");
            for (int i = 0; i < no_student; i++) //for loop
            {
                System.out.println("Enter your roll_no, name and score");
                roll_no = sc.nextInt();
                student = sc.next();
                grade =sc.next();

                switch (grade){
                    case "A":
                        System.out.println("A Grade - 100%");
                        break;
                    case "B":
                        System.out.println("B Grade - 80%");
                        break;
                    case "C":
                        System.out.println("C Grade - 70%");
                    default:
                        System.out.println("You are fail in 12th");
                }
                break;//break statement-which makes for loop run only once
            }

        }
    }
}
public class Example5 {
    public static void main(String[] args) {
        System.out.println("control flow statements");
        decisionMaking cf1 = new decisionMaking();
        cf1.displayGrade();
    }
}
