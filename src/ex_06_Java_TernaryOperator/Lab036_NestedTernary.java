package ex_06_Java_TernaryOperator;

import java.util.Scanner;

public class Lab036_NestedTernary {
    //    Covered in this class Lab064 - 24 DEC 2025
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter age of the person - ");
        int age = sc.nextByte();
//    Based on the age of the person determine if he/she can go to Goa and Drink there
//    To go to Goa age is 20 and to drink age is 25
//        Approach 1
        String result0 = age > 25 ? "Person can go to Goa & can drink as well" : (age > 20 ? "Person can go to Goa" : "Person can not go to Goa");
        System.out.println(result0);
//        Approach 2
        String result1 = age > 20 ? (age > 25 ? "Person can drink in Goa" : "Person can go to Goa but can not drink") : "Person can not go to Goa";
        System.out.println(result1);
        sc.close();
    }
}
