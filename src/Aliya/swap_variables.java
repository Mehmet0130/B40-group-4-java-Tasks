package Aliya;

public class swap_variables {
    public static void main(String[] args) {

        int a = 10;
        int b = 20;
        a = a + b;  //30
        b = a - b;  //10
        a = a - b;  //10
        System.out.println(a);
        System.out.println(b);

    }
}
