package ex_04_Java_Operators;

public class Lab025_Interview_Example {
// Covered in this class Lab048 Dec 22, 2025
    static void main() {
        int Salary = 12;
        boolean b = !(Salary>10||Salary<5);
//  BODMAS -- salary >10 -- T || Salary <5 -- F ; (T||F) - T - its NOT will be F
        System.out.println(b);
    }
}
