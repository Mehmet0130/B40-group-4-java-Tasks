package Bakhrom;

public class T11_sortAscending {

    /*
    Write a method that can sort an int array in Ascending order without using the sort method

    input :  {1, 5, 8, 3, 2, 11, -1}
    output : [-1, 1, 2, 3, 5, 8, 11]
     */

    public static void main(String[] args) {

        int[] input = {1, 5, 8, 3, 2, 11, -1};
        int[] sorted = sortAscending(input);

        for (int i = 0; i < sorted.length; i++) {
            System.out.print(sorted[i]);

            if (i < sorted.length - 1) System.out.print(", ");
        }

    }

    public static int[] sortAscending(int[] numbers) {

        for (int i = 0; i < numbers.length - 1; i++) {
            int minIndex = i;

            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[j] < numbers[minIndex]) {
                    minIndex = j;
                }
            }

            int temp = numbers[i];
            numbers[i] = numbers[minIndex];
            numbers[minIndex] = temp;
        }

        return numbers;
    }



}
