package Mehmet;

public class ReverseNumber {

    public static void main(String[] args) {
        System.out.println(reverseNumber(1234)); // Example: Output = 4321 ( positive number)
        System.out.println(reverseNumber(-1234)); // Example: Output =-4321 ( negative number)

    }

    public static int reverseNumber(int num) {
        int reversed = 0;                     // Step 1: store reversed number

        while (num != 0) {                    // Step 2: loop until number becomes 0
            int digit = num % 10;             // Step 3: extract last digit
            reversed = reversed * 10 + digit; // Step 4: build reversed number
            num = num / 10;                   // Step 5: remove last digit from num
        }

        return reversed;                      // Step 6: return final reversed number
    }


}
