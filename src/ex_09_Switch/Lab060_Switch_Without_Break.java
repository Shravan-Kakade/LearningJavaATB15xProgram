package ex_09_Switch;

import java.util.Scanner;

public class Lab060_Switch_Without_Break {
/*      Covered in this class Lab085,Lab086 - 05 Jan 2025
        From the next program What will be the Output when value is 5 ?  >
        Since break statement is not used after matching the condition all the subsequent values will also be printed
*/
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the number to check");
        if (sc.hasNextInt()) {
            int num = sc.nextInt();
            switch (num) {
                case 1:
                    System.out.println("Monday");
                    break;
                case 2:
                    System.out.println("Tuesday");
                case 3:
                    System.out.println("Wednesday");
                case 4:
                    System.out.println("Thursday");
                case 5:
                    System.out.println("Friday");
                case 6:
                    System.out.println("Saturday");
                case 7:
                    System.out.println("Sunday");
                default:
                    System.out.println("Enter the number in the range of 1 to 7");
            }
        } else {
            System.out.println("Please enter a number");
        }
    }
}
