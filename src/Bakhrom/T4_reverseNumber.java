package Bakhrom;

public class T4_reverseNumber {

    public static int reverseNumber(int number) {

        int reversed = 0;

         while(number != 0){
             reversed = reversed * 10 + (number % 10);
              number /= 10;
         }

         return reversed;
    }

    public static void main(String[] args) {

        System.out.println(reverseNumber(-13));
        System.out.println(reverseNumber(-791));
        System.out.println(reverseNumber(987));

    }

}
