package ex_06_Java_TernaryOperator;

import java.util.Scanner;

public class Lab038_TO_Task_2 {
//    Covered in this class Lab065 - 24 Dec 2025
    static void main() {
//    Find the larger number from 2 numbers
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of Number One - ");
        int a = sc.nextInt();
        System.out.print("Enter the value of Number Two - ");
        int b = sc.nextInt();
        String result = (a > b) ? "Number one is greater than two - "+a :
                ((a == b) ? "Both are equal" : "Number two is greater than one "+ b);
        System.out.println(result);
    }
}
