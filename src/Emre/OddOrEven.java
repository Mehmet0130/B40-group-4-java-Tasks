package Emre;

public class OddOrEven {
    public static void main(String[] args) {
        //Write  a method which can identifies given number is even or odd

        oddOrEven(-11);
    }

    public static void oddOrEven(int number){
        if(number % 2 == 0){
            System.out.println("Even");
        }else{
            System.out.println("Odd");
        }
    }


}
