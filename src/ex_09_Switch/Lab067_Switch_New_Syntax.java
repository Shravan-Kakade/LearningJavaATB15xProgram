package ex_09_Switch;

public class Lab067_Switch_New_Syntax {
//    Covered in this class Lab093 - 05 Jan 2025
static void main() {
    int itemCode = 125;
    switch (itemCode){
        case 124 -> System.out.println("124");
        case 125 -> System.out.println("125");
        case 126 -> System.out.println("126");
        default -> System.out.println("default");
    }
}

}
