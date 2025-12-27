package ex_04_Java_Operators;

public class Lab029_Interview_Char_Int {
    // covered in this class - Lab054 - Lab056 - 22 Dec 2025
    static void main() {
        char a = 'A';   // ASCII - 65
        char b = 'B';   // ASCII - 66
        System.out.println(a);
        System.out.println(b);
        System.out.println(a+b);    // When variables of datatype char are added in Java, it will behave as int &
        System.out.println(a-b);    // variables value will be converted to ASCII and addition of those values will take place

        System.out.println('A' == 65);

        short s = 20;
        System.out.println(s+a);    // char variable is converted to ASCII value and then addition took place
    }
}
