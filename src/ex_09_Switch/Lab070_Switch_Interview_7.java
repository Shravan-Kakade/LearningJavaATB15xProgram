package ex_09_Switch;

public class Lab070_Switch_Interview_7 {
//    Covered in this class Lab096 - 05 Jan 2026
//  What will be the output here ?
//  Here output will be "Hey there" as exact value 'A' will be matched in case
    static void main() {
        char c = 'A';
        switch (c) {
            case 'A':
                System.out.println("Hey there");
                break;
            case 'B':
                System.out.println("Hello there");
                break;
            case 'C':
                System.out.println("Is this correct?");
                break;
            default:
                System.out.println("default");
                break;
        }
    }
}
