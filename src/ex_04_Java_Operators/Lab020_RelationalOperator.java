package ex_04_Java_Operators;

public class Lab020_RelationalOperator {
    // Covered in this class - Lab040
/*
    Relational operators are - <, >, <=, >=, ==, !=
    These operators will always give boolean output after operating on operand
*/
    static void main() {
        int A = 25;
        int B = 30;
        int C = 10;
        boolean D = A > B, E = B > C, F = C > A;
        System.out.println("Now if A is grater than B? - " + D + "\nWhether B is greater than C? - "
                + E + "\nWhether C is greater than A? - " + F);
    }
}
