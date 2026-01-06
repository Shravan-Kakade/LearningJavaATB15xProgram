package ex_09_Switch;

public class Lab068_Switch_Syntax_2 {
//    Covered in this class Lab094 - 05 Jan 2025
static void main() {
    int itemCode = 004;
    switch (itemCode){
        case 001,003,005 -> System.out.println("Electronic Gadgets");
        case 002,004,006 -> System.out.println("Mechanical Gadgets");
        default -> System.out.println("default");
    }
}
}
