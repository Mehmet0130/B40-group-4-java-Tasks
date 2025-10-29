package Mehmet;
import java.util.*;
public class Week12_Array_SumUpTo0 {

    /*
    Write a function:
        that, given an integer N (1 < N < 100), returns an array containing N unique integers that sum up to 0.
        The function can return any such array.
        For example, given N = 4, the function could return [1,0, -3,2] or [-2,1, -4,5].
        The answer [1, -1,1,3] would be incorrect (because value 1 occurs twice).
        For N = 3 one of the possible answers is [-1,0,1] (but there are many more correct answers).
     */

    //Mehmet is volunteer



    public static int[] uniqueSumZero(int n) {
        Set<Integer> set = new HashSet<>();
        Random rand = new Random();
        int sum = 0;

        while (set.size() < n - 1) {
            int num = rand.nextInt(21) - 10;
            if (num != 0 && !set.contains(num)) {
                set.add(num);
                sum += num;
            }
        }


        if (!set.contains(-sum) && -sum != 0) {
            set.add(-sum);
        } else {

            return uniqueSumZero(n);
        }


        int[] result = new int[n];
        int i = 0;
        for (int each : set) {
            result[i++] = each;
        }
        return result;
    }


    public static void main(String[] args) {
        int N = 3;
        int[] arr =uniqueSumZero(N);

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }


}
