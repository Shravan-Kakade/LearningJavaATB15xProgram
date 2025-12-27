package ex_06_Java_TernaryOperator;

import java.util.Scanner;

public class Lab035_TernaryOperator2 {
    //    Covered in this class Lab063 both - 24 DEC 2025
    public static void main(String[] args) {
//        Determine whether given number is Postive or negative using Ternary Operator
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number that you want to check");
        int a = sc.nextInt();
        String result = a > 0 ? (a + " is positive number") : (a + " is a negative number");
        System.out.println(result);

//
        System.out.println("Enter the value of b - ");
        int b = sc.nextInt();
        boolean c = b<0? true:false;
        System.out.println(c);
        sc.close();
    }
}
