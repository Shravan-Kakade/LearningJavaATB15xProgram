package ex_04_Java_Operators;

public class Lab021_Logical_Operators {
//    Covered in this Class Lab041 - Dec 22, 2025
static void main() {
//    Logical operators are &&, || and ! (and, or and negative respectively)
//    NOT operator
    boolean A = true;
    System.out.println(A+" exact value of A is printed");
    System.out.println(!A + " Negated value of A is printed here");
    System.out.println(!!A);

//    OR operator
//    T||T - T;
//    T||F - T;
//    F||T - T;
//    F||F - F;
    boolean B = false;
    boolean or = A||B;
    System.out.println(or);

//    AND operator
//    T||T - T;
//    T||F - F;
//    F||T - F;
//    F||F - F;

}
}
