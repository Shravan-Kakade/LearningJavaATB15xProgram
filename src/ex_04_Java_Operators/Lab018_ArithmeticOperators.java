package ex_04_Java_Operators;

import java.util.Scanner;

public class Lab018_ArithmeticOperators {
/*
    Covered in this class - Lab037 & Lab039 - 19 DEC 2025
    Arithmetic operators are +,-,*,/(Division),%(Modulus) gives remainder
    These are binary operators as 2 operands are required to operate on
*/
static void main() {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter value of A - ");
    int A = sc.nextInt();
    System.out.println("Enter value of B - ");
    int B = sc.nextInt();
    System.out.println("Addition of A and B is "+(A+B));
    System.out.println("Substraction of A and B is "+(A-B));
    System.out.println("Multiplication of A and B is "+(A*B));
    System.out.println("Division of A and B is "+(A/B));
    System.out.println("Remainder of division of A and B is "+(A%B));
}
}
