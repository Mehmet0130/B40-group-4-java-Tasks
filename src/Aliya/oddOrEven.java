package Aliya;

public class oddOrEven {
    public static void main(String[] args) {
        //Write  a method which can identifies given number is even or odd
        int number = 0;

        boolean isEven =  number % 2 == 0;

        boolean isOdd = !isEven;

        System.out.println(number + " is an even number: " + isEven);
        System.out.println(number + " is an odd number: " + isOdd);


    }


}
