package ex_09_Switch;

public class Lab063_Switch_Interview_2 {
//  Covered in this class Lab089 - 05 Jan 2025

//  What will be the output of following program?
    static void main() {
        char a = 'A';
        switch (a) {
            case 65:
                System.out.println("Match ASCII");
                break;
            default:
                System.out.println("No Match");
        }
    }
//    As in this program ASCII value of 'A' will be matched with case value 65, Output will be match ASCII
//    While comparing char type of data behaves as integer
}
