package Ablimit;

import java.lang.reflect.Array;

public class MaxNumber {
    public static void main(String[] args) {

        int[] arr = {1,2,4,67,789,9,99,};
        int max=0;


        for (int eachNumber : arr) {
            if(eachNumber>max){
                max=eachNumber;
            }
        }

        System.out.println("max = " + max);

    }
}
