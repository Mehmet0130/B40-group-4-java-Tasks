package Ibrahim;

public class TC01_OddOrEven {
    public static void main(String[] args) {
        oddOrEven(11);

    }

    public static  void oddOrEven(int number){
        if(number % 2 == 0){
            System.out.println("the number is even.");
        }else {
            System.out.println("the number is odd.");
        }

    }
}


