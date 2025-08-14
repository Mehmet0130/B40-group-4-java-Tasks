package Bakhrom;

public class T3_swapTwoNumbers {

    public static void main(String[] args) {

//         Swap two variable values without using a third variable

        System.out.println("Method option");
        swap(1, 2); //method option
        swap(1.5, 2.5);

        int num1 = 10, num2 = 20;

        System.out.println("\nBefore swapping");
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);


        num1 = num2 + num1;
        num2 = num1 - num2;
        num1 = num1 - num2;


        System.out.println("\nAfter swapping");
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);


    }

    public static void swap(int num1, int num2){

        System.out.println("\nBefore swapping");
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);

        num1 = num2 + num1;
        num2 = num1 - num2;
        num1 = num1 - num2;

        System.out.println("\nAfter swapping");
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
    }

    public static void swap(double num1, double num2){

        System.out.println("\nBefore swapping");
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);

        num1 = num2 + num1;
        num2 = num1 - num2;
        num1 = num1 - num2;

        System.out.println("\nAfter swapping");
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
    }


}
