package ex_02_Java_Basics;

public class Lab012_Constants {
    static void main() {
//      Covered in this PROGRAM LAB025 - 19 DEC 2025
        System.out.println("Practice exercise for Constants");
    /*
    *   >   Constants are the special characters whose value can not be changed in program once defined
    *   >   If user tries to change value of it, user will get error
    *   >   How to define constant?
    *           >   Use final keyword for local variable
    *           >   Use public static final for global usage
    *           >   Naming Convention for Constant ->   UPPERCASE_WITH_UNDERSCORES ->   To improve readability and
                            Maintainability
    *
    */
        int a = 25;
        int b = 19; // Value of a & b is not constant as final keyword in not used in it

        final float PI = 3.14f; // Here value of PI is constant as final keyword is now used with it
        System.out.println(PI);
//      PI = 6.18f;             As the value of PI is final (Constant), it can not be changed later in program
        System.out.println(PI);
    }
}
