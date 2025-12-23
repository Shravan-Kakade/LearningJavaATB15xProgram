package ex_02_Java_Basics;

public class Lab013_VariableDeclaration {
//  Covered in this Class Lab026 to Lab028 - 19 DEC 2025
static void main() {
    System.out.println("Different methods of variable declaration");
//    Declaration first and then assignment
    int A; //Declaration
    A = 100; //Assignment of value to the variable
    System.out.println(A);
//    Declaration and Assignment together
    float B = 19.2014f; // Declaration and assignment in single statement
    System.out.println(B);
//    If All variables are of same datatype then - in this as well above two approach can be followed
//    i,e Declaration first and then assignment or both together
    byte Age1 = 20, Age2 = 35, Age3 = 49;  // Three Variables Declared and assigned value in single statement
    System.out.printf("Age of person 1, 2, 3 is %d, %d, %d respectively.", Age1, Age2, Age3);
}
}
