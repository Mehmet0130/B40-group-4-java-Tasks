package Bakhrom;

public class T1_oddOrEven {

    public static void main(String[] args) {

        oddOrEven(3);

    }

    public static void oddOrEven(int number){

        if(number % 2 == 0){
            System.out.println(number + " is an even number");
        }else if(number % 2 != 0){
            System.out.println(number + " is an odd number");
        }else{
            System.out.println(number + " is not odd or even");
        }

    }

}
