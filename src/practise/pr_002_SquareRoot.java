package practise;

import java.util.Scanner;

public class pr_002_SquareRoot {
    //     Find the square root of a number.
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of which you want Sqaure root - ");
        int num = sc.nextInt();
        float a,i;
        for (i = 1; i <= num; i++) {
            a = num / i;
            if (a == i) {
                System.out.println("Square root of " + num + " is - " + a);
            }
        }

    }
}
