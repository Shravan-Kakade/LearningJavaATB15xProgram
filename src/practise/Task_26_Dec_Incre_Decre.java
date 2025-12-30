package practise;

public class Task_26_Dec_Incre_Decre {
    static void main() {
        int a = 10;
        a = a++ + a++ + a++;    // 10|11|12 = 33
        System.out.println(a);


        int b = 3;
        int c = b++ * ++b;      //3*5 =15
        System.out.println(c);

        int d = 5;
        System.out.println(d++ + d--);  // 5+6 =11

    }
}
