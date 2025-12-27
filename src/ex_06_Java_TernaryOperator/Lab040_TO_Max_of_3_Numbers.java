package ex_06_Java_TernaryOperator;

public class Lab040_TO_Max_of_3_Numbers {
    //    Covered in this class - Lab067 - 24 DEC 2025
    static void main() {
//      Use the ternary operator and find maximum out of three numbers
        int a = 50 , b = 60, c = 40;
        int max = (a > b) ? ((a > c) ? a : c) : ((b > c) ? b : c);
        System.out.println("Largest value of a, b, c is - "+max);
//      Using the if else conditions
        if (a > b) {
            if (a > c) {
                System.out.println("Largest number is - a = " + a);
            } else {
                System.out.println("Largest number is - c = " + c);
            }
        } else if (b > c) {
            System.out.println("Largest number is - b = " + b);
        } else {
            System.out.println("Largest number is - c = " + c);
        }

    }
}
