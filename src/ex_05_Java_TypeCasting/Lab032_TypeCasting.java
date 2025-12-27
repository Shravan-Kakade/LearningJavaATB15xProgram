package ex_05_Java_TypeCasting;

public class Lab032_TypeCasting {
    //    Covered in this class Lab060 - Lab061 - Dec 24, 2025
    static void main() {
        long M = 123456789;
//      short i = M;  Implicit narrowing casting not allowed in Java
        short i = (short) M;    // Only Explicit narrowing is allowed in Java
        System.out.println(i);

//      TypeCasting Examples
        int cost = 2000;
        float tax = 18.45f;
        int totalValue = cost + (int) tax; // Explicit Narrowing done here but causing to lose value
        System.out.println("Total Value of the product here is - " + totalValue);
        float newTotalValue = cost + tax;
        System.out.println("Total Value of the product here is - " + newTotalValue); // Implicit Widening, no data loss happened
    }
}
