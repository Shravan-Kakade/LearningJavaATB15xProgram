package ex_09_Switch;

public class Lab069_Switch_Interview_6 {
//    Covered in this class Lab095 - 05 Jan 2026
//    What will be the output of following program?
static void main() {
    int a = 11;
    switch (-2){
        default -> System.out.println("default");
        case 1 -> System.out.println("1");
        case -2 -> System.out.println("Negative");
    }
}
//  Here output will be Negative as in switch statement variable is not given instead value is given.
}
