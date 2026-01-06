package ex_09_Switch;

public class Lab065_Switch_Interview_4 {
//    Covered in this class Lab091 - 05 Jan 2025

//    What will be the output in case of long type of data used in switch Statement?
    static void main() {
        long a = 125l;
        switch ((int)a){ //  Here directly long type of data cannot be used in switch statement.
                    //  We need to cast Explicitly Long type of data into int type
            case 125:
                System.out.println("Match");
                break;
            default:
                System.out.println("No Match");
        }
    }
}
