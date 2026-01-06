package ex_10_For_Loop;

public class Lab077_For_Loop_Even_From_Top50 {
//    Covered in this class Lab110 - 05 Jan 2026
//    To write a programme using for loop to print even and odd number between 1 and 50.
static void main() {
    for (int i =1 ; i <=50; i++){
        if (i%2==0){
            System.out.println(i + " is even number");
        }
        else {
            System.out.println(i +" is Odd number");
        }
    }
}
}
