package ex_05_Java_TypeCasting;

public class Lab030_TypeCasting_Widening {
//    Covered in this Class Lab057 - Dec 24, 2025
    static void main() {
        byte a= 100;
        int b = a;  //  Valid Syntax, Widening casting, Implicit, directly supported by Java
        int b1 = (int)a;    //  Widening casting, Explicit, Does not make sense as Implicit casting is already
                            //  supported by Java in case of Widening
    }
}
