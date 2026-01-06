package ex_10_For_Loop;

public class Lab072_For_Loop_Without_Condition {
    //    Covered in this class Lab101 and Lab102 - 05 Jan 2026
//  What will be the output of following program?
    static void main() {
        for (int i = 0; i > 1; i++) {
            System.out.println(i);
        }
        System.out.println("End");
//      Here for loop not be executed as condition will get false, directly "End" will be printed

//      Can for loop be written without any condition? > Answer is yes but it will execute infinitely
        for (int j = 0; ; j++){
            System.out.println(j);
        }
    }
}
