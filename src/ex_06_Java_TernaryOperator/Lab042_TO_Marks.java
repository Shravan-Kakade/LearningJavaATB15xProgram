package ex_06_Java_TernaryOperator;

public class Lab042_TO_Marks {
//    Covered in this class Lab069 - 24 Dec 2025
    //    Determine the result of the student based on the CLI Input
    static void main(String[] args) {
        for (int i = 0; i < args.length; i++) {
            String m = args[i];
            int marks = Integer.parseInt(m);
            String result = marks >= 40 ? ("Student " + i + " is Pass - " + marks) : ("Student " + i + " is fail - " + marks);
            System.out.println(result);
        }
    }
}
