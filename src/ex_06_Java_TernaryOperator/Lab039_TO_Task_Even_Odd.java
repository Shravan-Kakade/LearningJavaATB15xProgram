package ex_06_Java_TernaryOperator;

import java.util.Scanner;

public class Lab039_TO_Task_Even_Odd {
//    covered in this class - Lab066 - 24 Dec 2025
//    Find whether given number is even or odd using ternary operator
static void main() {
    Scanner sc = new Scanner(System.in);
    System.out.print("Please enter a number to check - ");
    int a = sc.nextInt();
    String result = (a%2==0)?"Given number is Even":"Given number is odd";
    System.out.println(result);
}
}
