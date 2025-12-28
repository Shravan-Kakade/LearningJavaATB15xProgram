package ex_07_Increment_Decrement_Operator;

public class Lab044_Post_Increment_Op {
//    Covered in this class Lab071 - 26 Dec 2025
static void main() {
//    In POST INCREMENT - Assignment of the variable values happens first and then increments happens
    int a = 20;
    int b = a++; // here a++ means assignment happens first and then value of a will be incremented
    System.out.println(a);
    System.out.println(b);

/*
    Expression and Response Table
    Line NO.    |   a   |   b   |
    7           |   20  |   NA  |
    8           |   21  |   20  |
    9           |   21  |   NA  |
    10          |   NA  |   20  |
*/
}
}
