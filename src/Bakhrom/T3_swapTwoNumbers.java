package Bakhrom;

public class T3_swapTwoNumbers {

    public static void main(String[] args) {

//         Swap two variable values without using a third variable

        System.out.println("Method option");
        swap(1, 2); //method option
        swap(1.5, 2.5);
        swap("SDET", "Developer");

        System.out.println("=========================================");

        int var1 = 10, var2 = 20;

        System.out.println("\nBefore swapping");
        System.out.println("var1 = " + var1);
        System.out.println("var2 = " + var2);


        var1 = var2 + var1;
        var2 = var1 - var2;
        var1 = var1 - var2;


        System.out.println("\nAfter swapping");
        System.out.println("var1 = " + var1);
        System.out.println("var2 = " + var2);


    }

    public static void swap(int var1, int var2){

        System.out.println("\nBefore swapping");
        System.out.println("var1 = " + var1);
        System.out.println("var2 = " + var2);

        var1 = var2 + var1;
        var2 = var1 - var2;
        var1 = var1 - var2;

        System.out.println("\nAfter swapping");
        System.out.println("var1 = " + var1);
        System.out.println("var2 = " + var2);
    }

    public static void swap(double var1, double var2){

        System.out.println("\nBefore swapping");
        System.out.println("var1 = " + var1);
        System.out.println("var2 = " + var2);

        var1 = var2 + var1;
        var2 = var1 - var2;
        var1 = var1 - var2;

        System.out.println("\nAfter swapping");
        System.out.println("var1 = " + var1);
        System.out.println("var2 = " + var2);
    }

    public static void swap(String var1, String var2){

        System.out.println("\nBefore swapping");
        System.out.println("var1 = " + var1);
        System.out.println("var2 = " + var2);

        var1 = var1 + var2;
        var2 = var1.substring(0, var1.length() - var2.length());
        var1 = var1.substring(var2.length());

        System.out.println("\nAfter swapping");
        System.out.println("var1 = " + var1);
        System.out.println("var2 = " + var2);

    }


}
