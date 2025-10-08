package Mehmet;

public class week09_FindMaxNumber {

    public static int findMaxNum(int[] numbers) {

        int max = numbers[0];

        // Loop through the array
        for (int i = 0; i < numbers.length-1; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }

        return max;
    }
    public static int findMinNum(int[] numbers) {

        int min = numbers[0];


        for (int i = 0; i < numbers.length-1; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }

        return min;
    }

    public static void main(String[] args) {
        int[] input = {1, 5, 8, 3, -2, 11, -1};
        System.out.println("Maximum number: " + findMaxNum(input));
        System.out.println("Minimum number: " + findMinNum(input));


        int[] input1 = {1, 50, -8, 30, 2, 11, -1};
        System.out.println("Maximum number: " + findMaxNum(input1));
        System.out.println("Minimum number: " + findMinNum(input1));
    }

}
