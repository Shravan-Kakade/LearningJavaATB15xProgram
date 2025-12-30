package practise;

public class Pr_004_Odd_Even_Number {
    static void main(String[] args) {
//  Write a Java program to accept a number and check whether the number is even or not.
//  Prints 1 if the number is even or 0 if odd.
        String num = args[0];
        int a = Integer.parseInt(num);
        int result = (a % 2 == 0) ? 1 : 0;
        System.out.println(result);
    }
}
