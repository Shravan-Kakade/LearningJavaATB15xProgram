package practise;

import java.util.Scanner;

public class Task_27_Dec_Triangle_Classifier {
    /*
        Write a program that classifies a triangle based on its side lengths.
        Given three input values representing the lengths of the sides,
        determine if the triangle is equilateral (all sides are equal),
        isosceles (exactly two sides are equal), or scalene (no sides are equal).
        Use an if-else statement to classify the triangle.
    */
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the length of side 1 of the Triangle - ");
        int s1 = sc.nextInt();
        System.out.println("enter the length of side 2 of the Triangle");
        int s2 = sc.nextInt();
        System.out.println("enter the length of side 3 of the Triangle");
        int s3 = sc.nextInt();

        if (s1 == s2 && s2 == s3) {
            System.out.println("Triangle is Equilateral Triangle");
        } else if (s1 == s2 || s2 == s3 || s1==s3) {
            System.out.println("Triangle is Isosceles Triangle");
        } else {
            System.out.println("Triangle is Scalene");
        }
    sc.close();
    }
}
