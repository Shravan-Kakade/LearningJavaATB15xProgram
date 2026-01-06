package practise;

import java.util.Scanner;

public class Pr_006_Factorial_of_Number {
//  Write a Program to Find Factorial of a Number in Java.
static void main() {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a number to find factorial - ");
    int num = sc.nextInt();
    long factorial = 1;
    for (int i = num; i>0;i--){
        factorial = factorial*i;
    }
    System.out.println(factorial);

}
}
