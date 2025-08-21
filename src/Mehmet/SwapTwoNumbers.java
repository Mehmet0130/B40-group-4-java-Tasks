package Mehmet;

public class SwapTwoNumbers {
    public static void main(String[] args) {
        int a = 10, b = 5;
        System.out.println("Before swaping two numbers: ");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("After swaping two numbers: ");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
