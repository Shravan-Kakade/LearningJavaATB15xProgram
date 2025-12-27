package ex_05_Java_TypeCasting;

public class Lab033_ExtraExamplesChar {
//    Covered in this class Lab061 Extra - 24 Dec 2025
static void main() {
    char ch = 'A';
    int one = ch;   // Implicit Widening
    System.out.println(one);
    int two = 65;       // ASCII value to char conversion will happen
    char b = (char)two; // Explicit Narrowing
    System.out.println(b);
}
}
