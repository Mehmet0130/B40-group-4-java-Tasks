package Aliya;

public class Week4_reverse_number {

    public static void main(String[] args) {
        System.out.println(reverseNumber(130789));
    }

    public static int reverseNumber(int num) {

        int rev = 0;
        while (num != 0) {
            int digit = num % 10;
            rev = rev * 10 + digit;
            num /= 10;

        }
        return rev;

    }

}
