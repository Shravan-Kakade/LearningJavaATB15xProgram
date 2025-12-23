package ex_02_Java_Basics;

public class Lab008_Variables {
    /*  Covered in this Class from Lab017 to Lab020

    Q. I want to store age of a person, which datatype should be used for it?
    A. byte would be appropriate > It can store values from -128 to 127
        >int or short can also be used, but it will consume more memory so for optimization
         byte is good option
    */
    static void main() {
//      Examples of data types
        byte Age_A = 60;
        byte _age = 20;
        System.out.println(Age_A + " & " + _age);
    /*
        Variable with only '_' will give error while printing
        int _ = 20;
        System.out.println(_);
    */
        char sample = 'A';
        boolean NewSample = true;
        System.out.println(sample + " & "+NewSample);
    }

}
