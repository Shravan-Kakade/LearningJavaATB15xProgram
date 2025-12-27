package ex_06_Java_TernaryOperator;

import java.util.Scanner;

public class Lab037_TO_Task {
//      Covered in this class - Task - 24 - Dec - 2025
//      Write a statement to determine if the student is PASS or FAIL using ternary operator
//      for passing marks should be greater than or equal to 40, else student is fail
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the marks of the student");
        int marks = sc.nextInt();
        String results = (marks >= 40) ? "Student is Pass" : "Student is fail";
        System.out.println(results);
    }
}
