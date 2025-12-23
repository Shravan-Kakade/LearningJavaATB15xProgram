package ex_03_Java_Literals;

public class Lab016_NonPrimitiveLiterals {
    //    Covered in this class Lab035
    static void main() {
        System.out.println("Non-Primitive Literal in Java");
        String Name = "Kraby"; // Here Kraby is NonPrimitive Literal

        String one = null;  // this is an example of null literal - Null Literal can only be used with Non-Primitive datatypes
//      As Primitive has zero value for Null

        System.out.println(Name);
        System.out.println(one);
        int[] Age = {20, 25, 54, 32, 23, 74}; // Here {20,25,54,32,23,74} is literal
        for (int i = 0; i<Age.length; i++) {
            System.out.println("Age of person " + i + " is - " + Age[i]);
        }
    }
}
