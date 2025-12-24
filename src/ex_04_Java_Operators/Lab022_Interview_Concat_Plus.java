package ex_04_Java_Operators;

public class Lab022_Interview_Concat_Plus {
    //      Covered in this class Lab042 and Lab043, DEC 22, 2025
//      Concatenation problem
    static void main() {
        int A = 20, B = 30;
        System.out.println(A + B);    // in case of integer '+' will do addition
        String s1 = "VenuGopal";
        String s2 = "Iyer";
        System.out.println(s1 + s2);  // in case of String '+' will do Concatenation

        System.out.println("Here CONCATENATION OF INTEGER ALONG WITH STRING WILL HAPPEN " + s1 + s2 + A + B);
/*      while concatenating strings if integer is also added in statement then it will concatenate
        integers as well along with strings

        To Add number in above scenario without concatenating use BODMAS
*/
        System.out.println("Here first addition of Integer and then concatenation with String will happen "+  s1 + s2 + (A + B));
        System.out.println(A + B + s1 + s2);    /*while adding integers if string is also added in statement
                                                 then it will add numbers first and then will concatenate the strings*/
        System.out.println(A - B + s1 + s2);

    }
}
