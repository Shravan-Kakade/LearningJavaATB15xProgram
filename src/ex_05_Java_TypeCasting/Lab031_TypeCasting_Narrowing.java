package ex_05_Java_TypeCasting;

public class Lab031_TypeCasting_Narrowing {
//    Covered in this class - Lab058 - Lab059 - 24 Dec 2025
static void main() {
    byte b = 10;
    int a = b;  // Widening casting
    System.out.println(a);

    int val = 400;
/*  byte n = val;    Implicit Narrowing - It is not possible in Java, even if user wants to convert then
                        Explicit Narrowing can be used*/
    byte b2 = (byte) val;
    System.out.println(b2);
/*
    Background process here, int val will be converted into binary. int supports 4 bytes and 32 bits - 0000000110010000
    then it will be added in the dataype byte b2 which has memory of only 1 byte and 8 bits - 10010000
    which will cause data loss then binary is again converted into integer and will be displayed in console.
*/
}
}
