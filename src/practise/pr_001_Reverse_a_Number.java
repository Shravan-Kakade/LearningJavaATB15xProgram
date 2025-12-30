package practise;

public class pr_001_Reverse_a_Number {
    static void main(String[] args) {
//        Write a Program to reverse given number - used for loop
        String n = args[0];
        int num = Integer.parseInt(n);
        System.out.println(num);
        int rev = 0;
        for (; num != 0; num = num / 10) {
            rev = rev * 10 + num % 10;
        }
        System.out.println(rev);

//        Write a program using while loop
        n = args[1];
        num = Integer.parseInt(n);
        System.out.println(num);
        rev = 0;
        while (num!=0){
            rev = rev*10 + num%10;
            num/=10; // this means num = num/10;
        }
        System.out.println(rev);

    }
}
