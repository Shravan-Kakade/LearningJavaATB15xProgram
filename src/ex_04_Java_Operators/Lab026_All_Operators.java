package ex_04_Java_Operators;

public class Lab026_All_Operators {
    //    Covered in this class Lab049 - Dec 24, 2025
    static void main() {
        int a = 546;
        int b = 454;
//        Relational and Arithmetic operator
        System.out.println(a + b);
        System.out.println(a > b);
        System.out.println(a >= b);
        System.out.println(a == b);
        System.out.println(a != b);
//        Compound Operators
        int c = 100;
        System.out.println(c);
        c += 100; // c = c + 100;
        System.out.println(c);
        c -= 50; //c = c - 50;
        System.out.println(c);
        c *= 3; // c = c * 3;
        System.out.println(c);
        c /= 5; // c = c / 5;
        System.out.println(c);
    }
}
