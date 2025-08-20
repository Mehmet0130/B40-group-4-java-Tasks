package Mehmet;


public class oddOrEven {

    public static void main(String[] args) {
        checkEvenOrOdd(10);
        checkEvenOrOdd(7);
    }


    public static void checkEvenOrOdd(int number) {
        if (number % 2 == 0) {
            System.out.println(number + " is even.");
        } else {
            System.out.println(number + " is odd.");
        }
    }



}
