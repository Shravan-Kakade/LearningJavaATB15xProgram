package ex_09_Switch;

import java.util.Scanner;

public class Lab059_Switch_Statement {
/*      Covered in this class Lab084 - 05 Jan 2025
     You need to take a user input and ask for the integer from 1 to 7.
     And if user enters 1 to 7,
     you will tell which day it is.
    */
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number that you want to check - ");
        if (sc.hasNextInt()) {
            int input = sc.nextInt();
            switch (input) {
                case 1:
                    System.out.println("Monday");
                    break;
                case 2:
                    System.out.println("Tuesday");
                    break;
                case 3:
                    System.out.println("Wednesday");
                    break;
                case 4:
                    System.out.println("Thursday");
                    break;
                case 5:
                    System.out.println("Friday");
                    break;
                case 6:
                    System.out.println("Saturday");
                    break;
                case 7:
                    System.out.println("Sunday");
                    break;
                default:
                    System.out.println("Enter the valid number between 1 to 7.");
                    break;
            }
        } else {
            System.out.println("Please enter valid input in Integer");
        }
    }
}
// If in above program value in between 1 and 7 is entered without using break statement
// every statement after matching the value will execute that's why break statement is used in switch.

// Someone might use String instead of Integer, that is why to cover edge case If-else is used