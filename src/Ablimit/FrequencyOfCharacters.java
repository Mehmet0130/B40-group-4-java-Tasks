package Ablimit;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class FrequencyOfCharacters {
    public static void main(String[] args) {


        String str = "AABBCCdeeFF";
        String unique = "";


        String[] arr = str.split("");
        //solution 1 ;
         for (String eachElement : arr) {
         if (!unique.contains(eachElement)){
         unique +=eachElement;
        }
         }
         System.out.println("unique = " + unique);


        //solution2 :
        /*
        Set<String> set = new HashSet<>(Arrays.asList(arr));
        for (String each : set) {
            unique +=each;
        }
        System.out.println("unique = " + unique);
    }
    */


    }

}
/*
    Write function that can find the frequency of characters
            Ex: FrequencyOfChars("AAABBCDD") ==> A3B2C1D2
     */