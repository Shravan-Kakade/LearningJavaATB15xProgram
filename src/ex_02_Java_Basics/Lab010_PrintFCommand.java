package ex_02_Java_Basics;

public class Lab010_PrintFCommand {
    /*Covered in this class Lab024

*   Difference between Println, print and printf?
    >   If ln is added after print > output will be taken to new line
    >   without ln > output will be added to same line
    >   If f is added after print > syntax will be as following
    */
    static void main() {
        int a = 50;
        System.out.printf("Value of A is %d",a ); // for anything which has relation with integer %d is used
//        i,e. byte, short, int, long
        String Name = "Shravan";
        System.out.printf("My name is %s", Name);
    }
}
