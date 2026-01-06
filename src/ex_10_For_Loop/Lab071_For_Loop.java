package ex_10_For_Loop;

public class Lab071_For_Loop {
//    Covered in this class Lab097 to Lab100 - 05 Jan 2026
//    for Loop
//    Help you to repeat a block of code.
//    Initialization -> Condition -> Updation(Incre/decre)
    static void main() {
        for (int i = 0; i <= 10; i++) {
            System.out.println("Here Addition will be " + (i + i));
        }
//      In for loop any variable name can be used -
        for (int dexter = 1; dexter <= 10; dexter++) {
            System.out.println(dexter);
        }

        for (int _abc = 10; _abc > 0; _abc--) {
            System.out.println("Decreasing order will be " + _abc);
        }
    }

}
