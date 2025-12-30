package practise;

import java.util.Scanner;

public class Pr_005_Palindrome_Number {
    //    Find if given number is palindrome or not
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter a number to check - ");
        int num = sc.nextInt();
        int a = num, b = num;
        int revWhile = 0, revFor = 0;

//  Using While loop

        while (a > 0) {
            revWhile = revWhile * 10 + a % 10;
            a /= 10;
        }
        if (num == revWhile) {
            System.out.println("Given number is Palindrome");
        } else {
            System.out.println("Number is not Palindrome number");
        }
//  Using for Loop

        for (; b > 0; b /= 10) {
            revFor = revFor * 10 + b % 10;
        }
        if (revFor == num) {
            System.out.println("Palindrome Number");
        } else {
            System.out.println("Not a Palindrome Number");
        }

    }
}
