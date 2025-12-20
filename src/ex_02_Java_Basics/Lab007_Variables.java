package ex_02_Java_Basics;

public class Lab007_Variables {
    static void main() {
//      Covered in this Class from Lab015 to Lab016

/*      How to Declare variable?
        >   datatype Variable_Name = Variable value;
            Here
        0.  datatypes -
            Differentiated as Primitive and Non-Primitive
            Primitive - byte, short, int, long, char | float, double | boolean
            Non-Primitive - String, Array, Enum
        1.  Variable_Name is an identifier
            Rules for defining variable -
            > Variable can contain Alphabets, digits & two special characters $ and _
            > First character of variable must be Alphabet or special chars i,e. $ or _
            > Keywords can not be used as Variables
        2.  = is an assignment operator > It assigns the value to variable
        3.  Variable value is called as Literal

        >   Value stored in variable can be changed at any point of time in program

*/
        System.out.println("Lets Understand Variables");
        int A = 15;
        System.out.println("After declaration value of A is " + A);
        char B = 'x';
        System.out.println("Current batch is " + A + "" + B);
        System.out.println("Changing value of A");
        A = 25;
        System.out.println("Now the value of A is " + A);
    }
}
